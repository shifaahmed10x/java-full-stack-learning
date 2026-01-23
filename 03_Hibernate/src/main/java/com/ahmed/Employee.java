package com.ahmed;

import jakarta.persistence.Entity;
import  jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


import java.util.List;

@Entity
//@Table(name = "employee_demo")
public class Employee {
    @Id
    private int emp_id;
   // @Column(name="emp_name")
    private String name;
    //@Transient
    private int age;
    @OneToMany
    private List<Laptop> laptops;

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

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", laptop=" + laptops +
                '}';
    }
}
