/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.BodyUser;
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
public interface BodyUserRepository extends CrudRepository<BodyUser, Long>{
    
    @Query("SELECT b FROM BodyUser b WHERE b.idUser = :idUser")
    public Iterable<BodyUser> findBodyUserByUser(@Param("idUser") Long idUser);
    
}
