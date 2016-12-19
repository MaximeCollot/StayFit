/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.*;


@Entity
@Table(name="t_exercise")
public class Exercise {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_exercise", nullable=false)
    private Long idExercise;
    
    @Column(name="exercise_name")
    private String nameExercise;
    
    @Column(name="exercise_description")
    private String descriptionExercise;
    
    @Column(name="exercise_is_leg")
    private int legExercise;
    
    @Column(name="exercise_difficulty_leg")
    private int legDifficultyExercice;
    
    @Column(name="exercise_is_arm")
    private int armExercise;
    
    @Column(name="exercise_difficulty_arm")
    private int difficultyArmExercise;
    
    @Column(name="exercise_is_cheast")
    private int cheastExercise;
    
    @Column(name="exercise_difficulty_cheast")
    private int difficultyCheastExercise;
    
    @Column(name="exercise_picture")
    private String pictureExercise;
    

    public Exercise(){
        
    }

    public Exercise(String nameExercise, String descriptionExercise,int legExercise, int legDifficultyExercice, int armExercise, int difficultyArmExercise, int cheastExercise, int difficultyCheastExercise, String pictureExercise   ) {
        this.nameExercise = nameExercise;
        this.descriptionExercise = descriptionExercise;
        this.legExercise = legExercise;
        this.legDifficultyExercice = legDifficultyExercice;
        this.armExercise = armExercise;
        this.difficultyArmExercise = difficultyArmExercise;
        this.cheastExercise = cheastExercise;
        this.difficultyCheastExercise = difficultyCheastExercise;
	this.pictureExercise = pictureExercise;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public String getDescriptionExercise() {
        return descriptionExercise;
    }

    public void setDescriptionExercise(String descriptionExercise) {
        this.descriptionExercise = descriptionExercise;
    }

    public int getLegExercise() {
        return legExercise;
    }

    public void setLegExercise(int legExercise) {
        this.legExercise = legExercise;
    }

    public int getLegDifficultyExercice() {
        return legDifficultyExercice;
    }

    public void setLegDifficultyExercice(int legDifficultyExercice) {
        this.legDifficultyExercice = legDifficultyExercice;
    }

    public int getArmExercise() {
        return armExercise;
    }

    public void setArmExercise(int armExercise) {
        this.armExercise = armExercise;
    }

    public int getDifficultyArmExercise() {
        return difficultyArmExercise;
    }

    public void setDifficultyArmExercise(int difficultyArmExercise) {
        this.difficultyArmExercise = difficultyArmExercise;
    }

    public int getCheastExercise() {
        return cheastExercise;
    }

    public void setCheastExercise(int cheastExercise) {
        this.cheastExercise = cheastExercise;
    }

    public int getDifficultyCheastExercise() {
        return difficultyCheastExercise;
    }

    public void setDifficultyCheastExercise(int difficultyCheastExercise) {
        this.difficultyCheastExercise = difficultyCheastExercise;
    }

    public String getPictureExercise() {
        return pictureExercise;
    }

    public void setPictureExercise(String pictureExercise) {
        this.pictureExercise = pictureExercise;
    }
    
    public void setIdExercise(Long id){
        this.idExercise = id;
    }
    
    public Long getIdExercise(){
        return idExercise;
    }
}
