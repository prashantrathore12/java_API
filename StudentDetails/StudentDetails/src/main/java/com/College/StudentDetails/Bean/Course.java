package com.College.StudentDetails.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "course")
public class Course {
    @Id
    private int CourseId;
    private String CourseName;
    private long CourseFee;
    @OneToOne(mappedBy = "course")
    private int FacultyId;
}
