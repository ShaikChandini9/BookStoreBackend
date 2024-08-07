package com.example.BookStore.controller;

import com.example.BookStore.entity.BookStore;
import com.example.BookStore.request.BookStoreRequest;
import com.example.BookStore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookStore")
@CrossOrigin(
        origins = {"http://localhost:4200/"},
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}
)
public class BookStoreController {
    @Autowired
    BookStoreService bookStoreService;

    @PostMapping("/setBooks")
    public ResponseEntity setBooks(@RequestBody BookStoreRequest bookStoreRequest){

        bookStoreService.setBooks(bookStoreRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/getAllBooks")
     public List<BookStore>getAllBooks(){

        return bookStoreService.getAllBooks();
     }

}
