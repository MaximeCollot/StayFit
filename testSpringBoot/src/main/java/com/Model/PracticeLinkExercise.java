/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;

//@Entity
@Embeddable //  /!\ A verifier !!!
@Table(name="t_practicelinkexercise")

public class PracticeLinkExercise {
   
   // /!\ Pas d'ID !!!!
    @Column(name="exercice_repetition")
    private int repetiton;
    
    @Column(name="exercice_set")
    private int set;
    
    @Column(name="exercice_duration")
    private int duration;
    
    @ManyToOne
    @JoinColumn(name = "t_practice_idt_practice", referencedColumnName ="idt_practice")
    // /!\ idT_Diner à modifier dans BDD !!!
    private int idPractice;
    
    @ManyToOne
    @JoinColumn(name = "t_exercise_idt_exercise", referencedColumnName ="idt_exercice")
    private int idExercise;
    
    public PracticeLinkExercise(){
        
    }

    public PracticeLinkExercise(int repetiton, int set, int duration) {
        this.repetiton = repetiton;
        this.set = set;
        this.duration = duration;
    }
    
    

    public int getRepetiton() {
        return repetiton;
    }

    public void setRepetiton(int repetiton) {
        this.repetiton = repetiton;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
}
