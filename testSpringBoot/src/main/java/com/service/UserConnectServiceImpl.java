/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.UserConnect;
import com.Repository.UserConnectRepository;
import com.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */
@Service
public class UserConnectServiceImpl implements UserConnectService{
    
    @Autowired
    private UserConnectRepository userConnectRepo;

    @Override
    public Iterable<UserConnect> findAll() {
        return userConnectRepo.findAll();
    }

 /*   @Override
    public String getEmail(Long iduser) {
        return userRepo.getEmail(iduser);
    } */

    @Override
    public UserConnect findOne(Long id) {
        return userConnectRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return userConnectRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        userConnectRepo.delete(id);
    }

    @Override
    public void delete(UserConnect u) {
         userConnectRepo.delete(u);
    }

    @Override
    public void save(UserConnect u) {
        userConnectRepo.save(u);
    }
}