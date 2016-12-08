/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Practice;
import com.Repository.PracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class PracticeServiceImpl implements PracticeService{
    
    @Autowired
    private PracticeRepository practiceRepo;

    @Override
    public Iterable<Practice> findAll() {
        return practiceRepo.findAll();
    }

    @Override
    public Practice findOne(Long id) {
        return practiceRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return practiceRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        practiceRepo.delete(id);
    }

    @Override
    public void delete(Practice p) {
         practiceRepo.delete(p);
    }

    @Override
    public void save(Practice p) {
        practiceRepo.save(p);
    }
}