package org.aryan.firstspringbootapp.service;

import org.aryan.firstspringbootapp.repo.LaptopRepository;
import org.aryan.firstspringbootapp.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
//        System.out.println("Method Called: addLaptop");
        laptopRepository.save(laptop);

    }
    public boolean isGoodForProgramming(Laptop laptop) {
        return false;
    }
}
