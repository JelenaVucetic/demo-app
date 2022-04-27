package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

   // @Query("select s FROM Student s WHERE s.email = ?1") //jbql Student is Entity
    Optional<Student> findStudentByEmail(String email);
}
