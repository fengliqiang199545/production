package cn.com.taiji.controller;

import cn.com.taiji.util.CollectionsFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

import static cn.com.taiji.common.Constants.VALIDATE_CODE;

@Controller
public class LoginController {
    /*
    *   shiro ajax登录
    * */
    @RequestMapping("/ajaxLogin")
    @ResponseBody
    public Map<String,Object> ajaxLogin(@RequestParam String username, @RequestParam String password, @RequestParam(required = false)String randomcode, HttpSession session)throws Exception{
        Map<String ,Object> map = CollectionsFactory.newHashMap();

        if (randomcode != null && !randomcode.equals("")){
            //取出session中正确的验证码
            String validateCode = (String)session.getAttribute(VALIDATE_CODE);
            //进行验证码的比对
            if (validateCode != null && !randomcode.equals(validateCode)){
                //校验失败
                map.put("msg","randomCode_error");
                return map;
            }
        }
        Subject currentUser = SecurityUtils.getSubject();
        //对当前用户判断是否被验证过，如果没有验证信息则重新进行验证
        if (!currentUser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);

            //验证使用login方法进行验证
            try{
                currentUser.login(token);
            }catch(UnknownAccountException ex){
                map.put("msg", "account_error");
            }catch(IncorrectCredentialsException ex){
                map.put("msg", "password_error");
            }catch(AuthenticationException ex){
                map.put("msg", "authentication_error");
            }
        }

        return map;
    }
}
