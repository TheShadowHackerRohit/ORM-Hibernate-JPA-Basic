package com.example.jpabasics.controller;


import com.example.jpabasics.service.LibraryCardService;
import com.example.jpabasics.models.LibraryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class LibraryCardController {


    @Autowired
    LibraryCardService libraryCardService;

    @PostMapping("/add-card")
    public String addCard(@RequestBody LibraryCard card){
        libraryCardService.addCard(card);
        return "Card added";
    }
}
