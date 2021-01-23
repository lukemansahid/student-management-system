package com.lukish.studentmanagementsystem.repositories;

import com.lukish.studentmanagementsystem.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
