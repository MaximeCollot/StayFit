package com.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCompleted;
import org.joda.time.DateTime;

@Entity
@Table(name = "t_user")
public class User {
    
    @Id
    @Column(name = "iduser")
    private Long iduser;
    
    @Column(name="user_lastname")
    private String firstname;
    
    @Column(name="user_firstname")
    private String lastname;
    
    @Column(name="user_birthday")
    private String birthday;

    @Column(name="user_sexe")
    private String sexe;

    @Column(name="user_creation_date")
    private String creation_date;
    
     @Column(name="user_last_visit_date")
    private String last_visit_date;
     
    @Column(name = "user_is_coach")
    private boolean is_coach;
    
     @Column(name = "user_is_dietitian")
    private boolean is_dietitian;
     
     @Column(name = "user_picture")
     private String picture;
     
     @Column(name = "user_size")
     private int size;
     
     /*
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_idgoal")
    private Goal goal;
    */
     

    public User(Long id, String firstname, String lastname, String birthday, String sexe, int size) throws ParseException {
      
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.iduser = id;
        this.creation_date = simpleDateFormat.format(new Date());
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.sexe = sexe;
        this.size = size;
    }
    
     
    public  User(){  
    }

    
    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getLast_visit_date() {
        return last_visit_date;
    }

    public void setLast_visit_date(String last_visit_date) {
        this.last_visit_date = last_visit_date;
    }

    public boolean isIs_coach() {
        return is_coach;
    }

    public void setIs_coach(boolean is_coach) {
        this.is_coach = is_coach;
    }

    public boolean isIs_dietitian() {
        return is_dietitian;
    }

    public void setIs_dietitian(boolean is_dietitian) {
        this.is_dietitian = is_dietitian;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String profile) {
        this.picture = profile;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    /*
    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }
*/
}