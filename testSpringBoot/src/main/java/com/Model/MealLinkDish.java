/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;


@Embeddable //  /!\ A verifier !!!
@Table(name="t_meallinkdish")
public class MealLinkDish {
   
   // /!\ Pas d'ID !!!!
    @Column(name="dish_quantity")
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "t_meal_idt_diner", referencedColumnName ="idt_diner")
    // /!\ idT_Diner à modifier dans BDD !!!
    private int idDiner;
    
    @ManyToOne
    @JoinColumn(name = "t_dish_idt_dish", referencedColumnName ="idt_dish")
    private int idDish;
    
    @ManyToOne
    @JoinColumn(name = "t_unit_idt_unit", referencedColumnName ="idt_unit")
    private int idUnit;

    public MealLinkDish(){
        
    }

    public MealLinkDish(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}