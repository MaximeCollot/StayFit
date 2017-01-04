/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;

//@Entity
@Embeddable //  /!\ A verifier !!!
@Table(name="t_dishlinkfood")
public class DishLinkFood {
    
    
    @Column(name="idt_dishlinkfood")
    private Long idt_dishlinkfood;
    
    @Column(name="food_quantity")
    private int foodQuantity;
    
    @ManyToOne
    @JoinColumn(name = "t_unit_idt_unit", referencedColumnName ="idt_unit")
    private int idUnit;
      
    @ManyToOne
    @JoinColumn(name = "t_dish_idt_dish", referencedColumnName ="idt_dish")
    private int idDish;
    
    @ManyToOne
    @JoinColumn(name = "t_food_idt_food", referencedColumnName ="idt_food")
    private int idFood;
    
    public DishLinkFood(){
        
    }

    public DishLinkFood(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }    

    
}
