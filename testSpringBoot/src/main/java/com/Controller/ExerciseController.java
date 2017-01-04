/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.Exercise;
import com.service.ExerciseService;
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
 
 * @author louis
 */
@RestController
public class ExerciseController {
    
    @Autowired
    private ExerciseService exerciseService;
    
   @CrossOrigin(origins = "*" )
   @RequestMapping(value = "/exercise", method = RequestMethod.GET)
    Iterable<Exercise> selectAll() throws Exception{
       return exerciseService.findAll();
    }    
    
    @CrossOrigin(origins = "*" )
    @RequestMapping(method = RequestMethod.POST, value = "/exercise/create")
    @ResponseBody
    public HttpStatus createPractice(@RequestParam(value = "nameExercise")  String nameExercise, @RequestParam(value = "descriptionExercise") String descriptionExercise,@RequestParam(value = "difficultyShoulderExercise") int difficultyShoulderExercise, @RequestParam(value = "legDifficultyExercice") int legDifficultyExercice, @RequestParam(value = "difficultyAbsExercise")int difficultyAbsExercise, @RequestParam(value = "difficultyArmExercise")  int difficultyArmExercise, @RequestParam(value = "difficultyButtExercise")  int difficultyButtExercise, @RequestParam(value = "difficultyBackExercise") int difficultyBackExercise, @RequestParam(value = "difficultyCheastExercise") int difficultyCheastExercise, @RequestParam(value = "pictureExercise") String pictureExercise  ) {
        Exercise p = new Exercise(nameExercise,  descriptionExercise,  legDifficultyExercice,   difficultyArmExercise,  difficultyCheastExercise, difficultyShoulderExercise, difficultyAbsExercise, difficultyButtExercise, difficultyBackExercise, pictureExercise );
        try {
            exerciseService.save(p);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;
        }
       return HttpStatus.ACCEPTED;
    }
    
    @CrossOrigin(origins = "*" )
   @RequestMapping(method = RequestMethod.DELETE, value = "/exercise/delete/{id}")
    public HttpStatus DeletePractice(@PathVariable Long id) {
        try {
            if (exerciseService.exists(id)) {
                 exerciseService.delete(id);
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
