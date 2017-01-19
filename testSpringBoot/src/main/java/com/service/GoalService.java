/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Goal;

/**
 *
 * @author Florian
 */
public interface GoalService {
    
        public  Iterable<Goal> findAll();
        
        public Goal findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(Goal g);
        
        public void save(Goal g);
}