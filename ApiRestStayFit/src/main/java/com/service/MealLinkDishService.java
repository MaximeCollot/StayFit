/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.MealLinkDish;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author louis
 */
public interface MealLinkDishService {
    
        public MealLinkDish findDataByPMealDish(@Param("idMeal") Long idMeal,@Param("idDish") Long idDish );
    
        public List<Long> findDishByMeal(@Param("idMeal") Long idMeal);
    
        public  Iterable<MealLinkDish> findAll();
        
        public MealLinkDish findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(MealLinkDish mld);
        
        public void save(MealLinkDish mld);
}
