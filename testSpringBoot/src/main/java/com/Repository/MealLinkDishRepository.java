/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.MealLinkDish;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MealLinkDishRepository extends CrudRepository<MealLinkDish, Long>{
    
    @Query("SELECT m.idDish FROM MealLinkDish m WHERE m.idDiner = :idMeal")
    public List<Long> findDishByMeal(@Param("idMeal") Long idMeal);
    
     @Query("SELECT p FROM MealLinkDish p WHERE p.idDiner = :idMeal AND p.idDish = :idDish")
    public MealLinkDish findDataByPMealDish(@Param("idMeal") Long idMeal,@Param("idDish") Long idDish );
} 

