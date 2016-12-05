/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author louis
 */
@Entity
@Table(name = "t_userconnect")
public class UserConnect {
    
    @Id
    @Column(name = "t_user_iduser")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_iduser;
    
    //@OneToOne()
    //private User user;
    
    @Column(name = "user_mail")
    private String email;
    
    @Column(name = "user_password")
    private String password;

    public UserConnect() {
    }    
    
    public UserConnect(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public Long getIduser() {
        return user_iduser;
    }

    public String getEmail() {
        return email;
    }

    public void setIdUser(Long id) {
        this.user_iduser = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
