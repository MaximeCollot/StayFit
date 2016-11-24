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

 /*   @Override
    public String getEmail(Long iduser) {
        return userRepo.getEmail(iduser);
    } */

    @Override
    public User findOne(Long id) {
        return userRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return userRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        userRepo.delete(id);
    }

    @Override
    public void delete(User u) {
         userRepo.delete(u);
    }
}
