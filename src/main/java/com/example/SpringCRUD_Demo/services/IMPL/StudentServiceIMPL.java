package com.example.SpringCRUD_Demo.services.IMPL;

import com.example.SpringCRUD_Demo.entities.Student;
import com.example.SpringCRUD_Demo.repositories.StudentRepository;
import com.example.SpringCRUD_Demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    public StudentRepository studentRepo;
    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentByEmailAndPassword(String email, String password) {
        return studentRepo.getStudentByEmailAndPassword(email,password);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudent(Integer id) {
        return studentRepo.getStudentById(id);
    }

}
