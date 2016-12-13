/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_practice")
public class Practice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_practice", nullable = false)
    private int idPractice;
    
    @Column(name="practice_date")
    private String date;
    
    @Column(name="practice_isdone")
    private int isDone;
    
    @Column(name = "t_goal_idt_goal")
    private int idGoal;
    
    @Column(name="practice_is_recommended")
    private int isRecommended;
    
    
    private int idUser;
    
    
    public Practice(){
        
    }

    public int getIdPractice() {
        return idPractice;
    }

    public Practice(String date, int isDone, int isRecommended) {
        this.date = date;
        this.isDone = isDone;
        this.isRecommended = isRecommended;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIsDone() {
        return isDone;
    }

    public void setIsDone(int isDone) {
        this.isDone = isDone;
    }

    public int getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(int isRecommended) {
        this.isRecommended = isRecommended;
    }
    
    
}