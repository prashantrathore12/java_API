package com.xadmin.SpringBootCrud.repository;

import com.xadmin.SpringBootCrud.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}
//hibernate.dialect.MySQL5InnoDBDialect