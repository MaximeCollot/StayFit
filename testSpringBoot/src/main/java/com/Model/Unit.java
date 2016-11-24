/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;


@Entity
@Table(name="t_unit")
public class Unit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_unit", nullable=false)
    private int idUnit;
    
    @Column(name="unit")
    private String unit;
    
    @Column(name="description")
    private String description;
    
    
    public Unit(){
        
    }

    public Unit(String unit, String description) {
        this.unit = unit;
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
