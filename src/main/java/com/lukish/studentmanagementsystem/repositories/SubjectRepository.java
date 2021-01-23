package com.lukish.studentmanagementsystem.repositories;

import com.lukish.studentmanagementsystem.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
