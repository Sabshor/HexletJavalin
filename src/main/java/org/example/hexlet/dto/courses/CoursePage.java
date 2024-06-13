package org.example.hexlet.dto.courses;

import org.example.hexlet.model.Course;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class CoursePage {
    private Course course;
}
