package cn.com.taiji.controller;
import cn.com.taiji.domain.customize.ActiveUser;
import cn.com.taiji.util.CollectionsFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static cn.com.taiji.common.Constants.NO_PERMISSION;

/*
*   进行权限认证的controller(未完成)
* */
@RestController
public class AuthorityJudgeController {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityJudgeController.class);

    @RequestMapping(value = "*/*_judge")
    public Map<String,Object> authorityJudge(HttpServletRequest request) throws Exception{
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();

        //根据uri，使用shiro判断当前用户的权限
        String uri = request.getRequestURI();
        String[] names = uri.split("/");

        String featureName = names[2];
        String operateName = names[3].split("_")[0];
        Map<String , Object> map = CollectionsFactory.newHashMap();
        if (!activeUser.getUserStatus().equals("1")){
            if (logger.isDebugEnabled()){
                logger.debug(NO_PERMISSION,"账户已经被锁定");
            }
            map.put("msg","您的账户已被锁定，请切换账户登录");
        }else if (!activeUser.getRoleStatus().equals("1")){
            if (logger.isDebugEnabled()){
                logger.debug(NO_PERMISSION,"角色已经被锁定");
            }
            map.put("msg","当前角色已被锁定，请切换账户登录");
        }else {
            if (logger.isDebugEnabled()) {
                logger.debug(NO_PERMISSION, "没有权限!");
            }
            if (subject.isPermitted(featureName + ":" + operateName)){
                map.put("msg","您没有权限，请切换用户登录！");
            }
        }

        return map;


    }
}
