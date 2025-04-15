package com.example.Lms.feature.teachingassignment.entity;

import com.example.Lms.feature.course.entity.Course;
import com.example.Lms.feature.staff.entity.Staff;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class TeachingAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Staff instructor;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDateTime assignmentDate;
}
