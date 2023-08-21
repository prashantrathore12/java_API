package com.xadmin.SpringBootCrud.service;
import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class SubjectService {
    @Autowired
    public SubjectRepository SubjectRepo;

    //Returning all subjects from DB
    public List<Subject> getAllSubjects(){
        List<Subject> subjects = new ArrayList<>();
        SubjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }
    //Adding the new subject in DB
    public void addSubject(Subject subject){
        SubjectRepo.save(subject);//save() use for both update and add and attribute
    }
    //Updating any existing subject in DB
    public void updateSubject(String id, Subject subject){
        SubjectRepo.save(subject);//save() use for both update and add and attribute, is attribute is not present then it will add and if present then it will update
    }
    public void deleteSubject(String id){
        SubjectRepo.deleteById(id);//save() use for both update and add and attribute, is attribute is not present then it will add and if present then it will update
    }
}
