/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author louis
 */
@Entity
@Table(name = "t_meal")
public class Meal {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idT_Diner", nullable = false)
    private Long idDiner;
    
    @Column(name="meal_creation_date")
    private String creationDate; 
    
    @Column(name="meal_description")
    private String description; 
    
    @Column(name="meal_id_Dietitian")
    private int idDietitian; 
    
    @Column(name="meal_is_recommended")
    private int isRecommended; 
         
    @Column(name = "t_goal_idt_goal")
    private Long idGoal;
    
    @Column(name = "t_user_iduser")
    private Long idUser;

    @Column(name = "meal_name")
    private String mealName;
    
    @Transient
    List<Dish> listDish;
    
    public Meal() {
    }

    public Meal( String description, int idDietitian, int isRecommended, Long idGoal, Long idUser, String mealName) {         
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.creationDate = simpleDateFormat.format(new Date());
        this.description = description;
        this.idDietitian = idDietitian;
        this.isRecommended = isRecommended;
        this.idGoal = idGoal;
        this.idUser = idUser;
        this.mealName = mealName;
    }

    public List<Dish> getListDish() {
        return listDish;
    }

    public void setListDish(List<Dish> listDish) {
        this.listDish = listDish;
    }
    
    public Long getIdDiner() {
        return idDiner;
    }

    public void setIdDiner(Long idDiner) {
        this.idDiner = idDiner;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdDietitian() {
        return idDietitian;
    }

    public void setIdDietitian(int idDietitian) {
        this.idDietitian = idDietitian;
    }

    public int getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(int isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Long getIdGoal() {
        return idGoal;
    }

    public void setIdGoal(Long idGoal) {
        this.idGoal = idGoal;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    } 
    
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    
}
