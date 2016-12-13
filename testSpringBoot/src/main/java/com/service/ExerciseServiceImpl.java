/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Exercise;
import com.Repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */
@Service
public class ExerciseServiceImpl implements ExerciseService {
    
    @Autowired
    private ExerciseRepository exerciseRepo;

    @Override
    public Iterable<Exercise> findAll() {
        return exerciseRepo.findAll();
    }

    @Override
    public Exercise findOne(Long id) {
        return exerciseRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return exerciseRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        exerciseRepo.delete(id);
    }

    @Override
    public void delete(Exercise d) {
        exerciseRepo.delete(d);
    }

    @Override
    public void save(Exercise d) {
        exerciseRepo.save(d);
    }
    
}
