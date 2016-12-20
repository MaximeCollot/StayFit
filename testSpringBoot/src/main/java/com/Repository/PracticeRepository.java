/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.Exercise;
import com.Model.Practice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author florian
 */
@Repository
public interface PracticeRepository extends CrudRepository<Practice, Long>{
    
        
    @Query("SELECT b FROM Practice b WHERE b.idGoal = :idGoal")
    public Iterable<Practice> findPracticeByGoal(@Param("idGoal") Long idGoal);
}

