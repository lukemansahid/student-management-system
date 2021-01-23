package com.lukish.studentmanagementsystem.repositories;

import com.lukish.studentmanagementsystem.models.Examination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationRepository extends JpaRepository<Examination, Integer> {
}
