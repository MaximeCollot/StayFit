/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="t_meallinkdish")
public class MealLinkDish {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="mld_id", nullable = false)
    private Long idMld;
       
    @Column(name="dish_quantity")
    private int quantity;
    
    @Column(name = "t_meal_idt_diner")
    private Long idDiner;
    
    @Column(name = "t_dish_idt_dish")
    private Long idDish;
   

    public MealLinkDish(){    
    }

    public MealLinkDish(int quantity, Long idDiner, Long idDish) {
        this.quantity = quantity;
        this.idDiner = idDiner;
        this.idDish = idDish;
    }

    public Long getIdMle() {
        return idMld;
    }

    public void setIdMle(Long idMld) {
        this.idMld = idMld;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getIdDiner() {
        return idDiner;
    }

    public void setIdDiner(Long idDiner) {
        this.idDiner = idDiner;
    }

    public Long getIdDish() {
        return idDish;
    }

    public void setIdDish(Long idDish) {
        this.idDish = idDish;
    }
    
    

    
    
    
}