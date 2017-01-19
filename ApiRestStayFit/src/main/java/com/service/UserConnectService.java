/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.UserConnect;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author louis
 */
public interface UserConnectService {
    
        public boolean emailExist(String email);
    
        public Long findIdByEmail(@Param("email") String email);
    
        public String findPswByEmail(@Param("email") String email);
    
        public  Iterable<UserConnect> findAll();
        
        public UserConnect findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(UserConnect u);
        
        public void save(UserConnect u);
}
