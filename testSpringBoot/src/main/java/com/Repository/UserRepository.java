/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repository;

import com.Model.User;
import javax.persistence.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author louis
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
        @org.springframework.data.jpa.repository.Query("SELECT u.password FROM UserConnect u where u.email = :email") 
        String findPswByEmail(@Param("email") String email);
           
        
}
