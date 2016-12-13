/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.BodyUser;
import com.Repository.BodyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */
@Service
public class BodyUserServiceImpl implements BodyUserService {
    
    @Autowired
    private BodyUserRepository bodyUserRepo;

    @Override
    public Iterable<BodyUser> findAll() {
        return bodyUserRepo.findAll();
    }

    @Override
    public BodyUser findOne(Long id) {
        return bodyUserRepo.findOne(id);
     }

    @Override
    public boolean exists(Long id) {
       return bodyUserRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
       bodyUserRepo.delete(id);
    }

    @Override
    public void delete(BodyUser bu) {
        bodyUserRepo.delete(bu);
    }

    @Override
    public void save(BodyUser bu) {
        bodyUserRepo.save(bu);
    }

    @Override
    public Iterable<BodyUser> findBodyUserByUser(Long idUser) {
        return bodyUserRepo.findBodyUserByUser(idUser);
    }
    
}
