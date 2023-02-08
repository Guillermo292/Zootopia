package com.zootopia.zootopia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genders")
public class Gender {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_gender")
    private Long id;
    @Column(nullable = false)
    private String gender;
    public Gender() {
    }
    public Gender(Long id, String gender) {
        this.id = id;
        this.gender = gender;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
