package com.manCh007.java.databaseinteraction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manCh007.java.databaseinteraction.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
