package com.lukish.studentmanagementsystem.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {

    private int id;
    private String name;
    private Faculty faculty;
    private List<Student> students;
    private List<Subject> subjects;

    public Department() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    public Faculty getFaculty() {
        return faculty;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @JsonManagedReference
    @OneToMany(mappedBy = "department")
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @JsonManagedReference
    @OneToMany(mappedBy = "department")
    public List<Subject> getSubjects() { return subjects;
    }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
