package com.springrest.springrest.services;
import com.springrest.springrest.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    public List<Courses> list = new ArrayList<>();
    public CourseServiceImpl(){
        list.add(new Courses(125, "Java Core", "Basic of Java"));
        list.add(new Courses(130, "Spring Boot", "Basic of SpringBoot"));
    }
    @Override
    public List<Courses> getCourse() {
        return list;
    }

    public Courses getCourse(long courseId){
        Courses c = null;
        for(Courses cr : list){
            if(cr.getId() == courseId){
                c = cr;
                break;
            }

        }return c;
    }
    public Courses addCourse(Courses co){
        list.add(co);
        return co;
    }

    @Override
    public List<Courses> removeCourse(long courseId) {
        //Courses c =null;
        for(Courses cr : list){
            if(cr.getId() == courseId){
                list.remove(courseId);
                break;
            }
        } return list;
    }
}
