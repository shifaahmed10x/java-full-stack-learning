package com.ahmed.app.service;

import com.ahmed.app.model.Laptop;
import com.ahmed.app.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }
    public boolean checkPerformance(Laptop lap){
        return true;
    }
}
