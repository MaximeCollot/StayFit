/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Exercise;

/**
 *
 * @author louis
 */
public interface ExerciseService {
    
        public  Iterable<Exercise> findAll();
        
        public Exercise findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(Exercise d);
        
        public void save(Exercise d);
    
}
