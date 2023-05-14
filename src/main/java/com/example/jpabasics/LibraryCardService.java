package com.example.jpabasics;

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
