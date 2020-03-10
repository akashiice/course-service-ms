package com.akash.courses.controller;

import com.akash.courses.model.StudentCourses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Slf4j
public class CourseController {

    @GetMapping("student/{studentId}/courses")
    public StudentCourses getStudentCourses(@PathVariable int studentId) {
        log.info("course-microservice");
        return new StudentCourses(studentId,
                Arrays.asList(
                        new StudentCourses.Course(1, "java"),
                        new StudentCourses.Course(2, "python")),
                new StudentCourses.Student(1, "akash"));
    }

}
