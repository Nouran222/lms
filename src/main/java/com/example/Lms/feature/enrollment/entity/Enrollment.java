package com.example.Lms.feature.enrollment.entity;

import com.example.Lms.feature.course.entity.Course;
import com.example.Lms.feature.student.entity.Student;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDateTime enrolledAt;
    private Double courseScore;
}
