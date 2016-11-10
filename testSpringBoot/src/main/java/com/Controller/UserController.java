/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.User;
import com.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author louis
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
   
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    Iterable<User> selectAll() throws Exception{
       return userService.findAll();
    }
    
    @RequestMapping("/index")
    public String index() {
        System.out.println("Bienvenue chez les users");
        return "";
    }
}
