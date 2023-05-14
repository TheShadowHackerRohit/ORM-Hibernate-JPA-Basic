package com.example.jpabasics.models;

import com.example.jpabasics.Department;
import com.example.jpabasics.models.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "library_card_info")

public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;

//    Department department = Department.IT;
    @Enumerated(EnumType.STRING)// it will store the enum as varchar
    private Department department;

    @CreationTimestamp//to automatically assign creation date;
    private Date issueDate;

    @UpdateTimestamp//automatically update the last date of operation
    private Date lastTransactionDate;

    @OneToOne
    @JoinColumn//by default, it makes primary key of student as foreign key
    Student student;

}
