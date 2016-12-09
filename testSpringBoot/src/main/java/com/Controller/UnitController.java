/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.Unit;
import com.service.UnitService;
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
public class UnitController {
    
    @Autowired
    private UnitService unitService;
    
     @RequestMapping(value = "/unit", method = RequestMethod.GET)
    Iterable<Unit> selectAll() throws Exception{
       return unitService.findAll();
    }
    
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/unit/create")
    @ResponseBody
    public String createUnit(@RequestParam(value = "unit") String unit, @RequestParam(value = "description") String description) {
        Unit u = new Unit(unit,description);
        try {
           unitService.save(u);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return e.getMessage();
        }
        return "creation successful: " + String.valueOf(u.getIdUnit());
    }
    
    //@ResponseBody
   @RequestMapping(method = RequestMethod.DELETE, value = "/unit/delete/{id}")
    public String DeleteUnit(@PathVariable Long id) {
        try {
            if (unitService.exists(id)) {
                 unitService.delete(id);
            } else {
                return "Erreur : Utilisateur inconnu";
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return e.getMessage();
        }
        return "Deletion successful: " ;
                
    }
    
    
    
}