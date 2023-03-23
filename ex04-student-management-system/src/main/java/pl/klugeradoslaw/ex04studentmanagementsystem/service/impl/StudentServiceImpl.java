package pl.klugeradoslaw.ex04studentmanagementsystem.service.impl;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex04studentmanagementsystem.entity.Student;
import pl.klugeradoslaw.ex04studentmanagementsystem.repository.StudentRepository;
import pl.klugeradoslaw.ex04studentmanagementsystem.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
