/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Practice;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Florian
 */
public interface PracticeService {
    
    public Iterable<Practice> findPracticeByGoal(@Param("idGoal") Long idGoal);
    
        public  Iterable<Practice> findAll();
        
        public Practice findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(Practice p);
        
        public void save(Practice p);
}
