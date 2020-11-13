package com.example.springswaggerpetstore.web;

import com.example.springswaggerpetstore.db.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
public class PetController {

    @GetMapping("/pet")
    Pet getPet() {
        final Pet pet = new Pet();
        pet.setName("Peter");
        return pet;
    }

    @PostMapping
    @RequestMapping("/pet/{petId}/uploadImage")
    ResponseEntity<String> uploadImage(
            @RequestParam("file") Optional<MultipartFile> file,
            @PathVariable("petId") String petId) {
        System.out.println("file = " + file);
        System.out.println("petId = " + petId);
        if (file.isPresent()) return ResponseEntity.ok("nice");
        else return ResponseEntity.badRequest().body("pay the cat tax!");
    }

}
