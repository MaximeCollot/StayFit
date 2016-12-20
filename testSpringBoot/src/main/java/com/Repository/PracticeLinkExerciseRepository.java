/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.PracticeLinkExercise;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author louis
 */
@Repository
public interface PracticeLinkExerciseRepository extends CrudRepository<PracticeLinkExercise, Long>{
    
    @Query("SELECT p.idExercise FROM PracticeLinkExercise p WHERE p.idPractice = :idPractice")
    public List<Long> findExerciseByPractice(@Param("idPractice") Long idPractice);
}
