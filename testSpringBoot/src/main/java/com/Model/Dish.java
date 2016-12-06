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
    private int idDish;
    
    @Column(name="dish_name")
    private String name;
    
    @Column(name="dish_description")
    private int description;
    
    //@ManyToOne
    @JoinColumn(name = "t_goal_idt_goal", referencedColumnName ="idt_goal")
    private int idGoal;
    
    
    public Dish(){
        
    }

    public Dish(String name, int description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
    
}
