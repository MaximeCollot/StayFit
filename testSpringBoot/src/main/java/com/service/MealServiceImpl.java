/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Meal;
import com.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */

@Service
public class MealServiceImpl implements MealService {
    
    @Autowired
    private MealRepository mealRepo;
    
    @Override
    public Iterable<Meal> findAll() {
        return mealRepo.findAll();
    }

    @Override
    public Meal findOne(Long id) {
        return mealRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return mealRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        mealRepo.delete(id);
    }

    @Override
    public void delete(Meal m) {
        mealRepo.delete(m);
    }

    @Override
    public void save(Meal m) {
        mealRepo.save(m);
    }

    @Override
    public Iterable<Meal> findMealByGoal(Long idGoal) {
        return mealRepo.findMealByGoal(idGoal);
    }
    
}
