/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author louis
 */
@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {
    
}
