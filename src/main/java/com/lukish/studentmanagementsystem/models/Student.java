package com.lukish.studentmanagementsystem.models;



import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Student implements Serializable {

    private int id;
    private String name;
    private String gender;
    private Date dob;
    private Department department;
//    private List<Subject> subjects;
    private int level;
    private Date yearAdmited;


    public Student() {
    }

    public Student(int id, String name, String gender, Date dob, Department department, int level, Date yearAdmited) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.department = department;
        this.level = level;
        this.yearAdmited = yearAdmited;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn()
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

//    @OneToMany
//    public List<Subject> getSubjects() {
//        return subjects;
//    }
//    public void setSubjects(List<Subject> subjects) {
//        this.subjects = subjects;
//    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public Date getYearAdmited() {
        return yearAdmited;
    }
    public void setYearAdmited(Date yearAdmited) {
        this.yearAdmited = yearAdmited;
    }
}
