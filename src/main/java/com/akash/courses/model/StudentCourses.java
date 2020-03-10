package com.akash.courses.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentCourses {

    private int id;

    private List<Course> course;

    private Student student;

    public static class Course {

        private int id;

        private String courseName;

        public Course(int id, String courseName) {
            this.id = id;
            this.courseName = courseName;
        }

        public Course() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    }

    public static class Student {

        private int id;

        private String studentName;

        public Student(int id, String studentName) {
            this.id = id;
            this.studentName = studentName;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
    }

}
