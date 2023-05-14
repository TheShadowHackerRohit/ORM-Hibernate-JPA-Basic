package com.example.jpabasics;

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
    int cardId;

//    Department department = Department.IT;
    @Enumerated(EnumType.STRING)// it will store the enum as varchar
    Department department;

    @CreationTimestamp//to automatically assign creation date;
    Date issueDate;

    @UpdateTimestamp//automatically update the last date of operation
    Date lastTransactionDate;

    @OneToOne
    @JoinColumn//by default it make primary key of student as foreign key
    Student student;

}
