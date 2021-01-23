package com.lukish.studentmanagementsystem.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Faculty implements Serializable {

    private int id;
    private String name;
    private String location;
    List<Department> departments;

    public Faculty() {}

    public Faculty(int id, String name, String location, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.departments = departments;
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

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonManagedReference
    @OneToMany(mappedBy = "faculty")
    public List<Department> getDepartments() { return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
