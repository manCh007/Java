package com.manCh007.java.dbInteraction.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manCh007.java.dbInteraction.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
