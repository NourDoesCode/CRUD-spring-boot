package com.nour.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "nour", LocalDate.of(2001, Month.MARCH, 11), "nour@gmail.com", 23));
    }
}
