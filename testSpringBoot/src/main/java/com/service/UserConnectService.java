/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.UserConnect;

/**
 *
 * @author louis
 */
public interface UserConnectService {
    
        public  Iterable<UserConnect> findAll();
        
        public UserConnect findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(UserConnect u);
        
        public void save(UserConnect u);
}
