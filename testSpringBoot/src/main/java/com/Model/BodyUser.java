package com.Model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="t_bodyuser")
public class BodyUser {
    
    @Id
    //@ManyToOne
    @JoinColumn(name = "t_user_iduser", referencedColumnName="iduser")
    private int idUser;
    
    @Column(name="bodyuser_weight")
    private String weight;
    
    @Column(name="bodyuser_recorde_date")
    private Date recordDate;
    
    @Column(name="bodyuser_islast")
    private int isLast;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="userId")
    private User user;
    
    protected  BodyUser(){
        
    }

    public BodyUser(String weight, Date recordDate, int gracemasse, int isLast) {
        this.weight = weight;
        this.recordDate = recordDate;
        this.graceMasse = gracemasse;
        this.isLast = isLast;
    }


    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

   

    /**
     * @return the recordDate
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * @param recordDate the recordDate to set
     */
    public void setRecordDate(Date recordDate) {
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