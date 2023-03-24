package pl.klugeradoslaw.ex04studentmanagementsystem.service;

import pl.klugeradoslaw.ex04studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long Id);

    Student updateStudent(Student student);

    void deleteStudent(Student student);

}
