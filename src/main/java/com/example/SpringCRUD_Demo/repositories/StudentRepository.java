package com.example.SpringCRUD_Demo.repositories;

import com.example.SpringCRUD_Demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    public Student getStudentById(Integer id);

    public Student getStudentByEmailAndPassword(String email,String password);


}
