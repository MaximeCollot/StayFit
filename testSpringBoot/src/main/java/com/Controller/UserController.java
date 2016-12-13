/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.User;
import com.Model.User.Sexe;
import com.Model.UserConnect;
import com.service.UserService;
import java.text.ParseException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;
import static org.hibernate.internal.CoreLogging.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author louis
 */
@RestController
@ControllerAdvice
public class UserController {
    
    @Autowired
    private UserService userService;
   
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    Iterable<User> selectAll() throws Exception{
       return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/create")
    @ResponseBody
    public HttpStatus createUserConnect(@RequestParam(value = "name") String name, @RequestParam(value = "firstname") String firstname,@RequestParam(value = "birthday") String birthday,  @RequestParam(value = "sexe") Sexe sexe, @RequestParam(value = "picture") String picture, HttpServletResponse response) throws ParseException {
        User u = new User(name, firstname,birthday, sexe, picture);
        try {
            userService.save(u);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.METHOD_FAILURE;
        }
        return HttpStatus.ACCEPTED;
    }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/user/delete/{id}")
    public HttpStatus DeleteUserConnect(@PathVariable Long id) {
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
