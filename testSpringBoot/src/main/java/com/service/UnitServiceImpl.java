/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.Unit;
import com.Repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class UnitServiceImpl implements UnitService{
    
    @Autowired
    private UnitRepository unitRepo;

    @Override
    public Iterable<Unit> findAll() {
        return unitRepo.findAll();
    }

    @Override
    public Unit findOne(Long id) {
        return unitRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return unitRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        unitRepo.delete(id);
    }

    @Override
    public void delete(Unit u) {
         unitRepo.delete(u);
    }

    @Override
    public void save(Unit u) {
        unitRepo.save(u);
    }
}