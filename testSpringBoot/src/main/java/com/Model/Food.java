/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;


@Entity
@Table(name="t_food")
public class Food {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_food", nullable = false)
    private int idFood;
    
    @Column(name="food_name")
    private String name;
    
    @Column(name="food_calorie_percent")
    private int caloriePercent;
    
    @Column(name="food_protein_percent")
    private int proteinPercent;
    
    @Column(name="food_carbohydrate_percent")
    private int carbohydratePercent;
    
    @Column(name="food_lipide_percent")
    private int lipidePercent;
   
    
    public Food(){
        
    }

    public Food(String name, int caloriePercent, int proteinPercent, int carbohydratePercent, int lipidePercent) {
        this.name = name;
        this.caloriePercent = caloriePercent;
        this.proteinPercent = proteinPercent;
        this.carbohydratePercent = carbohydratePercent;
        this.lipidePercent = lipidePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriePercent() {
        return caloriePercent;
    }

    public void setCaloriePercent(int caloriePercent) {
        this.caloriePercent = caloriePercent;
    }

    public int getProteinPercent() {
        return proteinPercent;
    }

    public void setProteinPercent(int proteinPercent) {
        this.proteinPercent = proteinPercent;
    }

    public int getCarbohydratePercent() {
        return carbohydratePercent;
    }

    public void setCarbohydratePercent(int carbohydratePercent) {
        this.carbohydratePercent = carbohydratePercent;
    }

    public int getLipidePercent() {
        return lipidePercent;
    }

    public void setLipidePercent(int lipidePercent) {
        this.lipidePercent = lipidePercent;
    }
    
    
}


