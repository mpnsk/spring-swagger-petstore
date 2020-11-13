package com.example.springswaggerpetstore.web;

import com.example.springswaggerpetstore.db.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @GetMapping
    Pet getPet(){
        final Pet pet = new Pet();
        pet.setName("Peter");
        return pet;
    }

}
