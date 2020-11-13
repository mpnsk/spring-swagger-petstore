package com.example.springswaggerpetstore.db;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Pet {
    @Id
    long id;
    String name;
}
