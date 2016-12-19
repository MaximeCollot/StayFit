package com.Model;

import java.text.SimpleDateFormat;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="t_bodyuser")
public class BodyUser {
    
    @Id
    @Column(name = "t_id_bodyuser")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBodyUser;

    @Column(name = "t_user_iduser")
    private Long idUser;
    
    @Column(name="bodyuser_weight")
    private int weight;
    
    @Column(name="bodyuser_recorded_date")
    private String recordDate;
    
    @Column(name="bodyuser_islast")
    private int isLast;
    
    @Column(name="bodyuser_gracemass")
    private int graceMasse;
    
    public BodyUser(){
        
    }

    public BodyUser(int weight,int gracemasse, int isLast, Long idUser) {
        this.idUser = idUser;
        this.weight = weight;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.recordDate= simpleDateFormat.format(new Date());
        this.graceMasse = gracemasse;
        this.isLast = isLast;
    }


    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

   
    public Long getIdBodyUser() {
        return idBodyUser;
    }

    /**
     * @return the recordDate
     */
    public String getRecordDate() {
        return recordDate;
    }

    /**
     * @param recordDate the recordDate to set
     */
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * @return the gracemasse
     */
    public int getGracemasse() {
        return graceMasse;
    }

    /**
     * @param gracemasse the gracemasse to set
     */
    public void setGracemasse(int gracemasse) {
        this.graceMasse = gracemasse;
    }

    /**
     * @return the isLast
     */
    public int getIsLast() {
        return isLast;
    }

    /**
     * @param isLast the isLast to set
     */
    public void setIsLast(int isLast) {
        this.isLast = isLast;
    }


}