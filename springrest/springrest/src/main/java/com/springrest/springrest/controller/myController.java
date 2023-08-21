package com.springrest.springrest.controller;
import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class myController {
    @Autowired
    private CourseService service;
    @GetMapping("/home")
    public String home(){
        return "this is home 2 page";
    }

    //Get the courses
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.service.getCourse();
    }

    @GetMapping("/courses/{CourseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.service.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses co){
        return this.service.addCourse(co);
    }

    @DeleteMapping("/courses/{courseId}")
    public List<Courses> removeCourse(String courseId){
        return this.service.removeCourse(Long.parseLong(courseId));
    }
}
