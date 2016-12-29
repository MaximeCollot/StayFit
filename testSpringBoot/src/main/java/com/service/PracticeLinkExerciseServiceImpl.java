/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.PracticeLinkExercise;
import com.Repository.PracticeLinkExerciseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author louis
 */
@Service
public class PracticeLinkExerciseServiceImpl implements PracticeLinkExerciseService {
    
    @Autowired
    private PracticeLinkExerciseRepository practExerRepo;

    @Override
    public Iterable<PracticeLinkExercise> findAll() {
        return practExerRepo.findAll();
    }

    @Override
    public PracticeLinkExercise findOne(Long id) {
        return practExerRepo.findOne(id);
    }

    @Override
    public boolean exists(Long id) {
        return practExerRepo.exists(id);
    }

    @Override
    public void delete(Long id) {
        practExerRepo.delete(id);
    }

    @Override
    public void delete(PracticeLinkExercise bu) {
        practExerRepo.delete(bu);
    }

    @Override
    public void save(PracticeLinkExercise bu) {
        practExerRepo.save(bu);
    }

    @Override
    public List<Long> findExerciseByPractice(Long idPractice) {
        return practExerRepo.findExerciseByPractice(idPractice);
    }

    @Override
    public PracticeLinkExercise findDataByPracticeExercise(Long idPractice, Long idExercise) {
            return practExerRepo.findDataByPracticeExercise(idPractice, idExercise);
        }
    
}
