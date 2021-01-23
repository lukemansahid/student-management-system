package com.lukish.studentmanagementsystem.services;

import com.lukish.studentmanagementsystem.models.Faculty;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FacultyService {

    Faculty saveFaculty(Faculty faculty);

    List<Faculty> findAllFaculty();

    Faculty findFacultyById(int id);

    ResponseEntity<?> deleteFaculty(int id);


}
