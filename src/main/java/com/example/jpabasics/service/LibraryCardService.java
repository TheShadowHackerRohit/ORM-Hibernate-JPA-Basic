package com.example.jpabasics.service;

import com.example.jpabasics.repository.LibraryCardRepository;
import com.example.jpabasics.models.LibraryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryCardService {

    @Autowired
    LibraryCardRepository libraryCardRepository;

    public void addCard(LibraryCard card){
        libraryCardRepository.save(card);
    }

}
