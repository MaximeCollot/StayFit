/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;


@Entity
@Table(name="t_goal")
public class Goal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_goal", nullable = false)
    private Long idGoal;
    
    @Column(name="goal_name")
    private String name;
    
    @Column(name="goal_description")
    private String description;
    
    @Column(name="goal_image")
    private String image;    
    
    public Goal(){
        
    }
    
    public Goal(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Long getIdGoal() {
        return idGoal;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}