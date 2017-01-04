/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.Meal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author louis
 */
public interface MealRepository extends CrudRepository<Meal, Long> {
 
   @Query("SELECT m FROM Meal m WHERE m.idGoal = :idGoal")
    public Iterable<Meal> findMealByGoal(@Param("idGoal") Long idGoal);
    
}
