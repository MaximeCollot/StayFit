/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.PracticeLinkExercise;
import com.service.PracticeLinkExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class PracticeLinkController {
    
    @Autowired
    private PracticeLinkExerciseService plService;
    
    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/practicelink", method = RequestMethod.GET)
    Iterable<PracticeLinkExercise> selectAll() throws Exception {
       return plService.findAll();
    }
    
    @CrossOrigin(origins = "*" )
    @RequestMapping(method = RequestMethod.POST, value = "/practicelink/create")
    @ResponseBody
    public HttpStatus createPracticeLink(@RequestParam(value = "repetition") int repetition, @RequestParam(value = "set") int set,@RequestParam(value = "duration") int duration, @RequestParam(value = "idPractice") Long idPractice, @RequestParam(value = "idExercise") Long idExercise ) {
        PracticeLinkExercise p = new PracticeLinkExercise(repetition, set, duration, idPractice, idExercise);
        try {
            plService.save(p);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;        
        }
        return HttpStatus.ACCEPTED;
    }
}
