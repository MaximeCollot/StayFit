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
    private int caloriePercent;
    
    @Column(name="dish_proteinpercent")
    private int proteinePercent;
    
    @Column(name="dish_glucidepercent")
    private int glucidePercent;
    
    @Column(name="dish_lipidpercent")
    private int lipidePercent;
    
    @Transient
    MealLinkDish mld;
    
    public Dish(){
        
    }

    public Dish(String name, String description, String dishRecette, int caloriePercent, int proteinePercent, int glucidePercent, int lipidePercent) {
        this.name = name;
        this.description = description;
        this.dishRecette = dishRecette;
        this.caloriePercent = caloriePercent;
        this.proteinePercent = proteinePercent;
        this.glucidePercent = glucidePercent;
        this.lipidePercent = lipidePercent;
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

    public String getDishRecete() {
        return dishRecette;
    }

    public void setDishRecete(String dishRecete) {
        this.dishRecette = dishRecete;
    }

    public int getCaloriePercent() {
        return caloriePercent;
    }

    public void setCaloriePercent(int caloriePercent) {
        this.caloriePercent = caloriePercent;
    }

    public int getProteinePercent() {
        return proteinePercent;
    }

    public void setProteinePercent(int proteinePercent) {
        this.proteinePercent = proteinePercent;
    }

    public int getGlucidePercent() {
        return glucidePercent;
    }

    public void setGlucidePercent(int glucidePercent) {
        this.glucidePercent = glucidePercent;
    }

    public int getLipidePercent() {
        return lipidePercent;
    }

    public void setLipidePercent(int lipidePercent) {
        this.lipidePercent = lipidePercent;
    }

    
}
