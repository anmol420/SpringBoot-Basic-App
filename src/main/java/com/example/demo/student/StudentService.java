package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Anmol Anand",
                        18,
                        LocalDate.of(2004,12,4),
                        "anmolanand2k15@gmail.com"
                )
        );
    }
}
