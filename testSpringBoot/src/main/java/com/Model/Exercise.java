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
   
    
    @Column(name="exercise_difficulty_leg")
    private int legDifficultyExercice;
    
    @Column(name="exercise_difficulty_arm")
    private int difficultyArmExercise;
    
    @Column(name="exercise_difficulty_cheast")
    private int difficultyCheastExercise;
    
    @Column(name="exercise_difficulty_shoulder")
    private int difficultyShoulderExercise;
    
     @Column(name="exercise_difficulty_abs")
    private int difficultyAbsExercise;
     
    @Column(name="exercise_difficulty_butt")
    private int difficultyButtExercise;
    
    @Column(name="exercise_difficulty_back")
    private int difficultyBackExercise;
        
    @Column(name="exercise_picture")
    private String pictureExercise;
    

    public Exercise(){
        
    }

    public Exercise(String nameExercise, String descriptionExercise ,int legDifficultyExercice, int difficultyArmExercise, int difficultyCheastExercise,int difficultyShoulderExercise, int difficultyAbsExercise, int difficultyButtExercise, int difficultyBackExercise,  String pictureExercise) {
        this.nameExercise = nameExercise;
        this.descriptionExercise = descriptionExercise;
        this.legDifficultyExercice = legDifficultyExercice;
        this.difficultyArmExercise = difficultyArmExercise;
        this.difficultyCheastExercise = difficultyCheastExercise;
        this.difficultyShoulderExercise = difficultyShoulderExercise;
        this.difficultyAbsExercise = difficultyAbsExercise;
        this.difficultyButtExercise = difficultyButtExercise;
        this.difficultyBackExercise = difficultyBackExercise;

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

    public int getDifficultyShoulderExercise() {
        return difficultyShoulderExercise;
    }

    public void setDifficultyShoulderExercise(int difficultyShoulderExercise) {
        this.difficultyShoulderExercise = difficultyShoulderExercise;
    }

    public int getDifficultyAbsExercise() {
        return difficultyAbsExercise;
    }

    public void setDifficultyAbsExercise(int difficultyAbsExercise) {
        this.difficultyAbsExercise = difficultyAbsExercise;
    }

    public int getDifficultyButtExercise() {
        return difficultyButtExercise;
    }

    public void setDifficultyButtExercise(int difficultyButtExercise) {
        this.difficultyButtExercise = difficultyButtExercise;
    }

    public int getDifficultyBackExercise() {
        return difficultyBackExercise;
    }

    public void setDifficultyBackExercise(int difficultyBackExercise) {
        this.difficultyBackExercise = difficultyBackExercise;
    }

    public int getLegDifficultyExercice() {
        return legDifficultyExercice;
    }

    public void setLegDifficultyExercice(int legDifficultyExercice) {
        this.legDifficultyExercice = legDifficultyExercice;
    }

    public int getDifficultyArmExercise() {
        return difficultyArmExercise;
    }

    public void setDifficultyArmExercise(int difficultyArmExercise) {
        this.difficultyArmExercise = difficultyArmExercise;
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
