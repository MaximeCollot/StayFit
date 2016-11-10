package com.Model;

import javax.persistence.*;


@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iduser;
    
    @Column(name="name")
    private String name;
    @Column(name="firstname")
    private String firstname;
    @Column(name="age")
    private int age;
    @Column(name="poids")
    private int poids;
    @Column(name="taille")
    private String taille;
    @Column(name="objectifs")
    private String objectifs;
    @Column(name="typeprofil")
    private String typeprofil;
    @Column(name="sexe")
    private String sexe;

    protected  User(){
        
    }

    public User(String name, String firstName, int age, int poids, String taille, String objectifs, String typeProfil, String sexe) {
        this.name = name;
        this.firstname = firstName;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
        this.objectifs = objectifs;
        this.typeprofil = typeProfil;
        this.sexe = sexe;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(String objectifs) {
        this.objectifs = objectifs;
    }

    public String getTypeProfil() {
        return typeprofil;
    }

    public void setTypeProfil(String typeProfil) {
        this.typeprofil = typeProfil;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}