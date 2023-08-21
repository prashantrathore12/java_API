package com.College.StudentDetails.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "student")
public class Student {
    @Id
    private int StudentId;
    private String StudentName;
    private String StudentAdd;
    private String StudentCourse;
    @OneToMany
    private Course courseId;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentAdd, String studentCourse, Course courseId) {
        StudentId = studentId;
        StudentName = studentName;
        StudentAdd = studentAdd;
        StudentCourse = studentCourse;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAdd() {
        return StudentAdd;
    }

    public void setStudentAdd(String studentAdd) {
        StudentAdd = studentAdd;
    }

    public String getStudentCourse() {
        return StudentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        StudentCourse = studentCourse;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }
    @Override
    public String toString () {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAdd='" + StudentAdd + '\'' +
                ", StudentCourse='" + StudentCourse + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
