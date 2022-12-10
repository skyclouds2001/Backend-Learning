package org.example.controller;

import org.example.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'id': 0}";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(int id, @RequestParam("user") String userName) {
        System.out.println("user get ..." + id + " " + userName);
        return "[{'id':0}]";
    }
    @PostMapping("/post")
    @ResponseBody
    public String post(User user) {
        System.out.println("user get ..." + user);
        return "[{'id':0}]";
    }

}
