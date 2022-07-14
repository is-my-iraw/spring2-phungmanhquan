package com.example.asm1.controller;

import com.example.asm1.entity.User;
import com.example.asm1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    UserService userService;

    @GetMapping({"/","/index"})
    public String getAll(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("users", userList);
        return "index";
    }

    @PostMapping("/create")
    public String create(Model model, @RequestParam Map<String, String> param){
        String name = param.get("name");
        String email = param.get("email");
        String address = param.get("address");
        String phone = param.get("phone");
        User user = new User(name, email, Integer.valueOf(address), Integer.valueOf(phone));
        userService.save(user);
        return "redirect:index";
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        userService.delete(id);
        return "redirect:index";
    }
}
