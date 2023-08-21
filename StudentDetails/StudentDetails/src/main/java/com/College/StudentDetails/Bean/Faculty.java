package com.College.StudentDetails.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "faculty")
public class Faculty {
    @Id
    private int FacultyId;
    private String FacultyName;
    private long FacultySal;
    @OneToOne
    @JoinColumn(name = "courseId")
    private Course CourseId;
}
