/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import java.text.SimpleDateFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="t_practice")
public class Practice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idt_practice", nullable = false)
    private Long idPractice;
    
    @Column(name="practice_date")
    private String date;
    
     @Column(name="t_practice_name")
    private String practiceName;
    
    @Column(name="practice_isdone")
    private int isDone;
    
    @Column(name = "t_goal_idt_goal")
    private Long idGoal;
    
    @Column(name="practice_is_recommended")
    private int isRecommended;
    
    @Column(name = "t_user_iduser")
    private Long idUser;

    @Transient
    private List<Exercise> listExo;

    
    public Practice(){
        
    }

    public Practice(String name, Long idGoal,Long idUser) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.practiceName=name;
        this.idUser = idUser;
        this.idGoal = idGoal;
        this.date = simpleDateFormat.format(new Date());
        this.isDone = 0;
        this.isRecommended = 1;
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

    
    public Long getIdPractice() {
        return idPractice;
    }

    public void setIdGoal(Long idGoal) {
        this.idGoal = idGoal;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdGoal() {
        return idGoal;
    }

    public Long getIdUser() {
        return idUser;
    }
    
    public String getPracticeName() {
        return practiceName;
    }

    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName;
    }
    
    public List<Exercise> getListExo() {
        return listExo;
    }

    public void setListExo(List<Exercise> listExo) {
        this.listExo = listExo;
    }
    
}