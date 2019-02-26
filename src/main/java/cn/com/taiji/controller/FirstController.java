package cn.com.taiji.controller;

import cn.com.taiji.domain.authority.SysPermission;
import cn.com.taiji.domain.customize.ActiveUser;
import cn.com.taiji.service.SysService;
import cn.com.taiji.util.CollectionsFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

import static cn.com.taiji.common.Constants.ACTIVE_USER;
import static cn.com.taiji.common.Constants.ERROR_HAPPENS;

@Controller
public class FirstController {
    private static final Logger logger = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    private SysService sysService;

    //跳转登录
    @RequestMapping(value = {"/","/first","/login"})
    public String first(Model model){
        return "login";
    }

    //首页
    @RequestMapping("/home")
    public String home(HttpSession session,Model model) throws  Exception{
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();

        List<SysPermission> permissionList = null;

        try {
            permissionList = sysService.findPermissionListByUserId(activeUser.getUserid());
        } catch (Exception e) {
            logger.error(ERROR_HAPPENS,e.getMessage());
        }

        List<String> sysPermissionList = CollectionsFactory.newArrayList();
        if (permissionList != null){
            for (int i = 0;i < permissionList.size();i++){
                sysPermissionList.add(permissionList.get(i).getPercode());
            }
        }
        model.addAttribute(ACTIVE_USER,activeUser);
        session.setAttribute("sysPermissionList",sysPermissionList);

        return "home";
    }

}
