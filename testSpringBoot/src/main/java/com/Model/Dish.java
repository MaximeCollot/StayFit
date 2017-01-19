/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;

@Entity
@Table(name="t_dish")
public class Dish {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_dish", nullable = false)
    private Long idDish;
    
    @Column(name="dish_name")
    private String name;
    
    @Column(name="dish_description")
    private String description;
    
    @Column(name="dish_recette")
    private String dishRecette;
    
     @Column(name="dish_caloriepercent")
    private int calorie;
    
    @Column(name="dish_proteinpercent")
    private int proteine;
    
    @Column(name="dish_glucidepercent")
    private int glucide;
    
    @Column(name="dish_lipidpercent")
    private int lipide;
    
    @Column(name="dish_picture")
    private String dishPicture;
    
    @Transient
    MealLinkDish mld;
    
    public Dish(){
        
    }

    public Dish(String name, String description, String dishRecette, int caloriePercent, int proteinePercent, int glucidePercent, int lipidePercent, String picture) {
        this.name = name;
        this.description = description;
        this.dishRecette = dishRecette;
        this.calorie = caloriePercent;
        this.proteine = proteinePercent;
        this.glucide = glucidePercent;
        this.lipide = lipidePercent;
        this.dishPicture = picture;
    }

    public String getDishRecette() {
        return dishRecette;
    }

    public void setDishRecette(String dishRecette) {
        this.dishRecette = dishRecette;
    }

    public MealLinkDish getMld() {
        return mld;
    }

    public void setMld(MealLinkDish mld) {
        this.mld = mld;
    }
    
    

    public Long getIdDish() {
        return idDish;
    }

    public void setIdDish(Long idDish) {
        this.idDish = idDish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getProteine() {
        return proteine;
    }

    public void setProteine(int proteine) {
        this.proteine = proteine;
    }

    public int getGlucide() {
        return glucide;
    }

    public void setGlucide(int glucide) {
        this.glucide = glucide;
    }

    public int getLipide() {
        return lipide;
    }

    public void setLipide(int lipide) {
        this.lipide = lipide;
    }

    

    public String getDishPicture() {
        return dishPicture;
    }

    public void setDishPicture(String dishPicture) {
        this.dishPicture = dishPicture;
    }

    
}
