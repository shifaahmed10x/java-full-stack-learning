package com.ahmed.app.repository;

import com.ahmed.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public  void save(Laptop lap){
        System.out.println("Saved in database");
    }
}
