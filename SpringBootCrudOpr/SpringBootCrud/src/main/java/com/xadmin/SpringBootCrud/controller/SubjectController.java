package com.xadmin.SpringBootCrud.controller;
import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;
import com.xadmin.SpringBootCrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    public SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
    @RequestMapping(method = RequestMethod.POST, value="/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){
        subjectService.updateSubject(id, subject);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
    public void deleteSubject(@PathVariable String id){
        subjectService.deleteSubject(id);
    }
}