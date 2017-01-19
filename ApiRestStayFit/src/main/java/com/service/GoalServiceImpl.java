/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Goal;
import com.Repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class GoalServiceImpl implements GoalService{
    
    @Autowired
    private GoalRepository goalRepo;

    @Override
    public Iterable<Goal> findAll() {
        return goalRepo.findAll();
    }

    @Override
    public Goal findOne(Long id) {
        return goalRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return goalRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        goalRepo.delete(id);
    }

    @Override
    public void delete(Goal g) {
         goalRepo.delete(g);
    }

    @Override
    public void save(Goal g) {
        goalRepo.save(g);
    }
}