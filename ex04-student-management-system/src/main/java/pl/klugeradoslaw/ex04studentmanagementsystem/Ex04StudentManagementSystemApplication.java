package pl.klugeradoslaw.ex04studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.klugeradoslaw.ex04studentmanagementsystem.entity.Student;
import pl.klugeradoslaw.ex04studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class Ex04StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Ex04StudentManagementSystemApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {

       /* Student student1 = new Student("Radosław", "Kluge", "kluge.radoslaw@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Dominika", "Chałupczak", "tyruryru@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("ups", "Winny", "winko@gmail.com");
        studentRepository.save(student3); */
    }
}
