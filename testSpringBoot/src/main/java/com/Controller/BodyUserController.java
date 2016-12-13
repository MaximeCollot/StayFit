/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.BodyUser;
import com.service.BodyUserService;
import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
public class BodyUserController {
    
    @Autowired
    private BodyUserService bodyUserService;
    
        @RequestMapping(value = "/bodyusers", method = RequestMethod.GET)
    Iterable<BodyUser> selectAll() throws Exception{
       return bodyUserService.findAll();
    }
    
           // @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(method = RequestMethod.GET, value = "/bodyuser/find/{id}")
     public Iterable<BodyUser> findBodyUserByUser(@PathVariable Long id) {
       try {
            if (bodyUserService.exists(id)) {
                 return bodyUserService.findBodyUserByUser(id);
            } else {
                  return null;
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return null;
        }
     }
    
    @RequestMapping(method = RequestMethod.POST, value = "/bodyuser/create")
    @ResponseBody
    public HttpStatus createBodyUser(@RequestParam(value = "weight") int weight, @RequestParam(value = "gracemasse") int gracemasse, @RequestParam(value = "isLast") int isLast, @RequestParam(value = "idUser") Long idUser) {
        BodyUser u = new BodyUser(weight, gracemasse,isLast, idUser);
        try {
            bodyUserService.save(u);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.METHOD_FAILURE;
        }
        return HttpStatus.ACCEPTED;
    }
    
}
