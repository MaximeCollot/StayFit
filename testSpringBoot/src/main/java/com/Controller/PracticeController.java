/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Model.Exercise;
import com.Model.Practice;
import com.service.ExerciseService;
import com.service.PracticeLinkExerciseService;
import com.service.PracticeService;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Florian
 */
@RestController
public class PracticeController {
    
    @Autowired
    private PracticeService practiceService;
    
    @Autowired
    private PracticeLinkExerciseService pleService;
    
     @Autowired
    private ExerciseService exoService;
     
    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/practice", method = RequestMethod.GET)
    Iterable<Practice> selectAll() throws Exception{
       return practiceService.findAll();
    }
    
    @CrossOrigin(origins = "*" )
    @RequestMapping(method = RequestMethod.GET, value = "/practice/find/{id}")
     public Practice findPracticeById(@PathVariable Long id) {
         
       try {
                 return practiceService.findOne(id);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
     }
     
    @CrossOrigin(origins = "*" )
    @RequestMapping(method = RequestMethod.GET, value = "/practice/goal/{id}")
     public Iterable<Practice> findPracticeByIdGoal(@PathVariable Long id) {
       try {
              return practiceService.findPracticeByGoal(id);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
     }
     
    @CrossOrigin(origins = "*" )
    @RequestMapping(method = RequestMethod.GET, value = "/practice/findpractices/{id}")
     public List<Practice> findPracticeByGoal(@PathVariable Long id) {
         List<Practice> ple = new ArrayList<>();
         List<Long> listId = new ArrayList<>();
         Exercise e = new Exercise();
         List<Exercise> listExo;
       try {
              ple.addAll((Collection<? extends Practice>) practiceService.findPracticeByGoal(id));
              for (Practice p : ple) {
                  listExo = new ArrayList<>();
                  listId = pleService.findExerciseByPractice(p.getIdPractice());
                  System.err.println("List Exo : "+ listId.toString() +"IdPractice"+p.getIdPractice());
                  for (Long i : listId) {
                      e = exoService.findOne(i);
                      e.setPle(pleService.findDataByPracticeExercise(p.getIdPractice(), i));
                      listExo.add(e);
                  }
                  p.setListExo(listExo);
              }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
       return ple;
     }
    
    @CrossOrigin(origins = "*" )
    @RequestMapping(method = RequestMethod.POST, value = "/practice/create")
    @ResponseBody
    public HttpStatus createPractice(@RequestParam(value = "date") String date, @RequestParam(value = "isDone") int isDone,@RequestParam(value = "isRecommended") int isRecommended, @RequestParam(value = "idUser") Long idUser ) {
        Practice p = new Practice(date,isDone,isRecommended, idUser);
        try {
            practiceService.save(p);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return HttpStatus.NOT_ACCEPTABLE;        
        }
        return HttpStatus.ACCEPTED;
    }
    
    @CrossOrigin(origins = "*" )
   @RequestMapping(method = RequestMethod.DELETE, value = "/practice/delete/{id}")
    public HttpStatus DeletePractice(@PathVariable Long id) {
        try {
                 practiceService.delete(id);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            return HttpStatus.NOT_ACCEPTABLE;        
        }
        return HttpStatus.ACCEPTED;               
    }
    
    
    
}
