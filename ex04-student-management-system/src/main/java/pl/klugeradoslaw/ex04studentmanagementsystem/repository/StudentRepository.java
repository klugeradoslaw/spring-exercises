package pl.klugeradoslaw.ex04studentmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.klugeradoslaw.ex04studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
