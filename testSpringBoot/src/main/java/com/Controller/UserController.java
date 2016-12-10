/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.User;
import com.Model.UserConnect;
import com.service.UserConnectService;
import com.service.UserService;
import java.text.ParseException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
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
@ControllerAdvice
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserConnectService userConnectService;
   
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    Iterable<User> selectAll() throws Exception{
       return userService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(method = RequestMethod.POST, value = "/user/create")
    @ResponseBody
<<<<<<< HEAD
    public HttpStatus createUser(@RequestParam(value = "name") String name, @RequestParam(value = "firstname") String firstname,@RequestParam(value = "birthday") String birthday,  @RequestParam(value = "sexe") Sexe sexe, @RequestParam(value = "picture") String picture) throws ParseException {
        User u = new User(name, firstname,birthday, sexe, picture);
=======
    public HttpStatus createUser(@RequestParam(value = "id") Long id, @RequestParam(value = "firstname") String firstname, @RequestParam(value = "lastname") String lastname,@RequestParam(value = "birthday") String birthday,  @RequestParam(value = "sexe") String sexe, @RequestParam(value = "size") int size, HttpServletResponse response) throws ParseException {
        User u = new User(id,firstname, lastname, birthday, sexe, size);
>>>>>>> louisDev
        try {
            userService.save(u);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;
        }
        return HttpStatus.ACCEPTED;
    }
    
       // @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(method = RequestMethod.GET, value = "/user/find/{id}")
     public User findUserById(@PathVariable Long id) {
         User user = new User();
       try {
            if (userConnectService.exists(id)) {
                 user = userService.findOne(id);
            } else {
                  return null;
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return null;
        }
        return user; 
     }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/user/delete/{id}")
    public HttpStatus DeleteUser(@PathVariable Long id) {
        try {
              if (userService.exists(id)) {
                 userService.delete(id);
             } else {
                 return HttpStatus.METHOD_FAILURE;
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.METHOD_FAILURE;
        }
        return HttpStatus.ACCEPTED;
                
    }
    
    @RequestMapping("/index")
    public String index() {
        System.out.println("Bienvenue chez les users");
        return "";
    }
}
