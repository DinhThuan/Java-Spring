package com.example.demo.service;

import com.example.demo.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public int insertStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudentById(int studentId);

    public List<Student> selectAllStudent();

    public Student selectStudentById(int studentId);
}
