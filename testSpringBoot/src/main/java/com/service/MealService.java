/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Meal;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author louis
 */
public interface MealService {
    
        public Iterable<Meal> findMealByGoal(@Param("idGoal") Long idGoal);
    
        public  Iterable<Meal> findAll();
        
        public Meal findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(Meal m);
        
        public void save(Meal m);
}
