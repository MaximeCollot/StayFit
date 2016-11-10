/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.User;
import com.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepo;

    @Override
    public Iterable<User> findAll() {
        return userRepo.findAll();
    }
    
}
