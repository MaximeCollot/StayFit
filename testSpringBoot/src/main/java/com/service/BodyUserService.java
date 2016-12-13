/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.BodyUser;

/**
 *
 * @author louis
 */
public interface BodyUserService {
    
        public Iterable<BodyUser> findBodyUserByUser(Long idUser);
    
        public  Iterable<BodyUser> findAll();
        
        public BodyUser findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(BodyUser bu);
        
        public void save(BodyUser bu);
}
