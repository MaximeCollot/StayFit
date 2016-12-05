/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import ch.qos.logback.classic.Logger;
import com.Model.User;
import com.Model.UserConnect;
import com.service.UserConnectService;
import com.service.UserService;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author louis
 */

@RestController
public class UserConnectController {
    
    @Autowired
    private UserConnectService userConnectService;
    
     @RequestMapping(value = "/userConnect", method = RequestMethod.GET)
    Iterable<UserConnect> selectAll() throws Exception{
       return userConnectService.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/userConnect/find/{id}")
     public UserConnect findUserConnect(@PathVariable Long id) {
         UserConnect user = new UserConnect();
       try {
            if (userConnectService.exists(id)) {
                 user = userConnectService.findOne(id);
            } else {
                  return null;
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return null;
        }
        return user; 
     }
    
    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(method = RequestMethod.POST, value = "/userConnect/create")
    @ResponseBody
    public HttpStatus createUserConnect(@RequestParam(value = "email") String email, @RequestParam(value = "psw") String psw) {
        UserConnect u = new UserConnect(email,psw);
        u.setIdUser(new Long(4));
        try {
            userConnectService.save(u);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;
        }
        return  HttpStatus.ACCEPTED;
    }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/userConnect/delete/{id}")
    public HttpStatus DeleteUserConnect(@PathVariable Long id) {
        try {
            if (userConnectService.exists(id)) {
                 userConnectService.delete(id);
            } else {
                  return HttpStatus.NOT_ACCEPTABLE;
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            //return e.getMessage();
        }
     return HttpStatus.ACCEPTED;                
    }
    
    
    
}
