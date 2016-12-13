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
    
   @RequestMapping(value = "/exercise", method = RequestMethod.GET)
    Iterable<Exercise> selectAll() throws Exception{
       return exerciseService.findAll();
    }
    
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/exercise/create")
    @ResponseBody
    public HttpStatus createPractice(@RequestParam(value = "nameExercise")  String nameExercise, @RequestParam(value = "descriptionExercise") String descriptionExercise,@RequestParam(value = "legExercise") int legExercise, @RequestParam(value = "legDifficultyExercice") int legDifficultyExercice, @RequestParam(value = "armExercise")int armExercise,@RequestParam(value = "difficultyArmExercise")  int difficultyArmExercise,@RequestParam(value = "cheastExercise")  int cheastExercise, @RequestParam(value = "difficultyCheastExercise") int difficultyCheastExercise, @RequestParam(value = "pictureExercise") String pictureExercise  ) {
        Exercise p = new Exercise(nameExercise,  descriptionExercise, legExercise,  legDifficultyExercice,  armExercise,  difficultyArmExercise,  cheastExercise,  difficultyCheastExercise,  pictureExercise );
        try {
            exerciseService.save(p);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;
        }
       return HttpStatus.ACCEPTED;
    }
    
    //@ResponseBody
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
