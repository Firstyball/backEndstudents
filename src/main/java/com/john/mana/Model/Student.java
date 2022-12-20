package com.john.mana.Model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "student")
public class Student {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private int age;

    private String teacher;
}
