package com.lukish.studentmanagementsystem.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Examination {

    private int id;
    private int cat;
    private int exams;
    private int level;
    private String semister;
    private Student student;
    private Subject subject;
    private Department department;

    public Examination() {
    }

    public Examination(int id, int cat, int exams, int level, String semister, Student student, Subject subject, Department department) {
        this.id = id;
        this.cat = cat;
        this.exams = exams;
        this.level = level;
        this.semister = semister;
        this.student = student;
        this.subject = subject;
        this.department = department;
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCat() {
        return cat;
    }
    public void setCat(int cat) {
        this.cat = cat;
    }

    public int getExams() {
        return exams;
    }
    public void setExams(int exams) {
        this.exams = exams;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getSemister() {
        return semister;
    }
    public void setSemister(String semister) {
        this.semister = semister;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
