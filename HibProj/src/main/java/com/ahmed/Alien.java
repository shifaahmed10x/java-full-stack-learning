package com.ahmed;

import jakarta.persistence.*;

@Entity
@Table(name = "alien_table")
public class Alien {
    @Id
    private  int aid;
    @Column(name="name")
    private  String aname;
    @Transient // not needed in database
    private String tech;
    private String laptop;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
