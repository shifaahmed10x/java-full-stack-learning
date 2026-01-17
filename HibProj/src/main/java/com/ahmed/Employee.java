package com.ahmed;

import jakarta.persistence.Entity; //JPA
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Employee {
    @Id
    private int emp_id;
    private String name;
    private int age;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
