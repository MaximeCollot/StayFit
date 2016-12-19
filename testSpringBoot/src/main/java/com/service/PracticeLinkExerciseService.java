/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.Model.PracticeLinkExercise;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author louis
 */
public interface PracticeLinkExerciseService {
    
        public List<Long> findExerciseByPractice(@Param("idPractice") Long idPractice);

        public  Iterable<PracticeLinkExercise> findAll();
        
        public PracticeLinkExercise findOne(Long id);
        
        public boolean exists(Long id);
        
        public void delete(Long id);
        
        public void delete(PracticeLinkExercise bu);
        
        public void save(PracticeLinkExercise bu);
}
