/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.User;
import com.Model.UserConnect;
import com.Repository.UserConnectRepository;
import com.Repository.UserRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    @Override
    public String findPswByEmail(String email) {
        return userConnectRepo.findPswByEmail(email);
    }

    @Override
    public Long findIdByEmail(String email) {
        return userConnectRepo.findIdByEmail(email);
    }
    
    @Override
    public boolean emailExist(String email) {
        List<UserConnect>  listU = new ArrayList<>();
        listU = (List<UserConnect>) (Collection<? extends UserConnect>) userConnectRepo.findAll();
        
        for (UserConnect uc : listU) {
            if(uc.getEmail().equals(email)){
                return true;
            }
        }
        
        return false;
    }

}
