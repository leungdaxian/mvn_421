package org.lyx.controll;

import org.lyx.pojo.DevUser;
import org.lyx.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

//import org.apache.commons.io.FileUtils;

@Controller
@RequestMapping("/dev")
public class DevUserController {

    @Resource
    private DevUserService devUserService;

    @RequestMapping("/login")
    public String login(ModelMap map,DevUser user){

        DevUser devUser=devUserService.login(user);

        if(devUser!=null){
            map.addAttribute("devUserSession",devUser);
            return "developer/main";
        }
        return "devlogin";
    }

    @RequestMapping("/logout")
    public String logout(ModelMap map){
        return "devlogin";
    }

    @RequestMapping("/flatform")
    public String flatform(ModelMap map){


        return "appinfolist";
    }

}
