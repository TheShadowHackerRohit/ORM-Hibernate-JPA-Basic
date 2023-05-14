package com.example.jpabasics;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_info")
public class Student {

    @Id
    private int studentId;

    private int age;

    @Column(name = "full_name")
    private String name;

    private int marks;



    @OneToOne(mappedBy = "student")
    LibraryCard libraryCard;


}
