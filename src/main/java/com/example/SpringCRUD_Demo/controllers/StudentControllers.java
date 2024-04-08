package com.example.SpringCRUD_Demo.controllers;


import com.example.SpringCRUD_Demo.entities.Student;
import com.example.SpringCRUD_Demo.services.IMPL.StudentServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class StudentControllers {

    @Autowired
    public StudentServiceIMPL studentServImpl;

    @GetMapping("/Add")
    public Student addStudent(@RequestBody Student student){
     return studentServImpl.addStudent(student);

    }
    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id){
     return studentServImpl.getStudent(id);
    }

    @PostMapping("/getEmail")
    public Student getStudentByEmailAndPassword(@RequestBody Student student){
        String email = student.getEmail();
        String password = student.getPassword();
        return studentServImpl.getStudentByEmailAndPassword(email,password);
    }

    @PostMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentServImpl.updateStudent(student);
    }
}
