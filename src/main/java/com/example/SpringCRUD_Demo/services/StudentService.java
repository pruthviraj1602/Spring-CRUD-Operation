package com.example.SpringCRUD_Demo.services;

import com.example.SpringCRUD_Demo.entities.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    public Student addStudent(Student student);

    public  Student getStudent(Integer id);

    public Student getStudentByEmailAndPassword(String email,String password);

    public Student updateStudent(Student stud);
}
