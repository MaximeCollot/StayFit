/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.Practice;
import com.service.PracticeService;
import java.util.Date;
import static org.joda.time.format.ISODateTimeFormat.date;
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
public class PracticeController {
    
    @Autowired
    private PracticeService practiceService;
    
     @RequestMapping(value = "/practice", method = RequestMethod.GET)
    Iterable<Practice> selectAll() throws Exception{
       return practiceService.findAll();
    }
    
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/practice/create")
    @ResponseBody
    public String createPractice(@RequestParam(value = "date") Date date, @RequestParam(value = "isDone") int isDone,@RequestParam(value = "isRecommended") int isRecommended ) {
        Practice p = new Practice(date,isDone,isRecommended);
        try {
            practiceService.save(p);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return e.getMessage();
        }
        return "creation successful: " + String.valueOf(p.getIdPractice());
    }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/practice/delete/{id}")
    public String DeletePractice(@PathVariable Long id) {
        try {
            if (practiceService.exists(id)) {
                 practiceService.delete(id);
            } else {
                return "Erreur : Practice inconnu";
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return e.getMessage();
        }
        return "Deletion successful: " ;
                
    }
    
    
    
}
