/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Dish;
import com.Repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class DishServiceImpl implements DishService{
    
    @Autowired
    private DishRepository dishRepo;

    @Override
    public Iterable<Dish> findAll() {
        return dishRepo.findAll();
    }

    @Override
    public Dish findOne(Long id) {
        return dishRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return dishRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        dishRepo.delete(id);
    }

    @Override
    public void delete(Dish d) {
         dishRepo.delete(d);
    }

    @Override
    public void save(Dish d) {
        dishRepo.save(d);
    }

  
}
