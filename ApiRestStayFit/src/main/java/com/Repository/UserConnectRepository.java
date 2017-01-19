/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.UserConnect;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author louis
 */
@Repository
public interface UserConnectRepository extends CrudRepository<UserConnect,Long> {
 
        @Query("SELECT u.password FROM UserConnect u where u.email = :email") 
        String findPswByEmail(@Param("email") String email);
        
        @Query("SELECT u.iduser FROM UserConnect u where u.email = :email") 
        Long findIdByEmail(@Param("email") String email);
}
