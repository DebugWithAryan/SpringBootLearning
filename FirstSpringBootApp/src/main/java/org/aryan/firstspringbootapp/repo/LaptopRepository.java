package org.aryan.firstspringbootapp.repo;

import org.aryan.firstspringbootapp.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("saving Laptop");

    }
}
