/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.Goal;
import com.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
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
    
     @RequestMapping(value = "/goal", method = RequestMethod.GET)
    Iterable<Goal> selectAll() throws Exception{
       return goalService.findAll();
    }
    
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/goal/create")
    @ResponseBody
    public String createGoal(@RequestParam(value = "name") String name, @RequestParam(value = "description") String description) {
        Goal g = new Goal(name,description);
        try {
            goalService.save(g);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return e.getMessage();
        }
        return "creation successful: " + String.valueOf(g.getIdGoal());
    }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/goal/delete/{id}")
    public String DeleteGoal(@PathVariable Long id) {
        try {
            if (goalService.exists(id)) {
                 goalService.delete(id);
            } else {
                return "Erreur : Goal inconnu";
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return e.getMessage();
        }
        return "Deletion successful: " ;
                
    }
    
    
    
}