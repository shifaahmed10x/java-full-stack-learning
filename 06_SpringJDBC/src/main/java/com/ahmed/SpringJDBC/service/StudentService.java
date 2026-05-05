package com.ahmed.SpringJDBC.service;

import com.ahmed.SpringJDBC.model.Student;
import com.ahmed.SpringJDBC.repo.StudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudRepo repo;
    public StudRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudRepo repo) {
        this.repo = repo;
    }


    public void addStudent(Student s){
        repo.save(s);
    }
    public List<Student> getStudents(){
        return repo.findAll();
    }
}
