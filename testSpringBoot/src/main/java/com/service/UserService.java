/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.User;

/**
 *
 * @author louis
 */
public interface UserService {
        
        public  Iterable<User> findAll();
        
        public User findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(User u);
        
        public void save(User u);
        
}
