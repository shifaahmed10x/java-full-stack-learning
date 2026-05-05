package com.ahmed.SpringJDBC.repo;

import com.ahmed.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudRepo {

   private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public  void save(Student s){
        String sql = "insert into student (rollno , name ,division) values (?,?,?)";
        int rows = jdbc.update(sql,s.getRollno(),s.getName(),s.getDivision());
        System.out.println(rows + "effected");
    }
    public List<Student> findAll(){
       List<Student> students = new ArrayList<>();
        return students;
    }

}
