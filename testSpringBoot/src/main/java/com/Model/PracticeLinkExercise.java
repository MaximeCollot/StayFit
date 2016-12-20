/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;

@Entity
@Table(name="t_practicelinkexercise")
public class PracticeLinkExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="t_practicelinkexercise")
    private int id;    
           
    @Column(name="exercise_repetition")
    private int repetiton;
    
    @Column(name="exercise_set")
    private int set;
    
    @Column(name="exercise_duration")
    private int duration;
    
    @Column(name="t_practice_idt_practice")
    private Long idPractice;
    
    @Column(name="t_exercise_idt_exercise")
    private Long idExercise;
    

    public PracticeLinkExercise(){
        
    }

    public PracticeLinkExercise(int repetiton, int set, int duration,Long idPractice, Long idExercise) {
        this.repetiton = repetiton;
        this.set = set;
        this.duration = duration;
        this.idExercise = idExercise;
        this.idPractice = idPractice;
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
    
    public int getId() {
        return id;
    }    

    public Long getIdPractice() {
        return idPractice;
    }

    public void setIdPractice(Long idPractice) {
        this.idPractice = idPractice;
    }

    public Long getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(Long idExercise) {
        this.idExercise = idExercise;
    }
    
}
