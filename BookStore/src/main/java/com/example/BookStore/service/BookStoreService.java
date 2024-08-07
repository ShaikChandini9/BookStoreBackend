package com.example.BookStore.service;

import com.example.BookStore.entity.BookStore;
import com.example.BookStore.request.BookStoreRequest;

import java.util.List;

public interface BookStoreService {

    void setBooks(BookStoreRequest bookStoreRequest);
    List<BookStore> getAllBooks();
}
