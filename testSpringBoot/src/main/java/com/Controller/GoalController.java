/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.Goal;
import com.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Florian
 */
@RestController
public class GoalController {
    
    @Autowired
    private GoalService goalService;
    
    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(value = "/goal", method = RequestMethod.GET)
    Iterable<Goal> selectAll() throws Exception{
       return goalService.findAll();
    }
    
    
    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(method = RequestMethod.POST, value = "/goal/create")
    @ResponseBody
    public HttpStatus createGoal(@RequestParam(value = "name") String name, @RequestParam(value = "description") String description) {
        Goal g = new Goal(name,description);
        try {
            goalService.save(g);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;
        }
        return HttpStatus.ACCEPTED;
    }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/goal/delete/{id}")
    public HttpStatus DeleteGoal(@PathVariable Long id) {
        try {
            if (goalService.exists(id)) {
                 goalService.delete(id);
            } else {
                return HttpStatus.NOT_ACCEPTABLE;
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;
        }
        return HttpStatus.ACCEPTED;                
    }
    
    
    
}