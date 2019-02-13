package cn.com.taiji.controller;

import cn.com.taiji.service.SysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
