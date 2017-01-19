/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.MealLinkDish;
import com.Repository.MealLinkDishRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */
@Service
public class MealLinkDishServiceImpl implements MealLinkDishService {
    
    @Autowired
    private MealLinkDishRepository mldRepo;

    @Override
    public Iterable<MealLinkDish> findAll() {
        return mldRepo.findAll();
    }

    @Override
    public MealLinkDish findOne(Long id) {
        return mldRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return mldRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        mldRepo.delete(id);
    }

    @Override
    public void delete(MealLinkDish mld) {
        mldRepo.delete(mld);
    }

    @Override
    public void save(MealLinkDish mld) {
        mldRepo.save(mld);
    }

    @Override
    public List<Long> findDishByMeal(Long idMeal) {
        return mldRepo.findDishByMeal(idMeal);
    }

    @Override
    public MealLinkDish findDataByPMealDish(Long idMeal, Long idDish) {
        return mldRepo.findDataByPMealDish(idMeal, idDish);
    }
    
    
}
