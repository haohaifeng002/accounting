package com.hhf.act.controller;

import com.hhf.act.model.User;
import com.hhf.act.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by haohaifeng on 2017/4/25.
 * 实例：http://blog.csdn.net/haluoluo211/article/details/52225074
 */
@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    private UserService userService;


//    @RequestMapping("")
//    public String index() {
//        return "index";
//    }

//    @RequestMapping("/json")
//    @ResponseBody
//    public List<String> json() {
//        Map<String, String> result = new HashMap<String, String>();
//        result.put("MarK", "hello");
//        result.put("Ken", "Hehe");
//        result.put("Fowafolo", "fool");

//        return userService.getAllUsernames();
//    }

    /**
     * @todo :  http://localhost:8080/main/save
     * @return
     */
    @RequestMapping("/save")
    public String index(){
        User user = new User();
//        user.setId(11);
        user.setUsername("hhhh1");
        userService.saveusers(user);
        return "index";
    }

    /**
     * @todo:http://localhost:8080/main/list
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<User> list() {
        return userService.getAllUsernames();
    }
}
