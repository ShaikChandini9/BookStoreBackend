package com.example.BookStore.serviceImpl;

import com.example.BookStore.Repository.BookStoreRepository;
import com.example.BookStore.entity.BookStore;
import com.example.BookStore.request.BookStoreRequest;
import com.example.BookStore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookStoreImpl implements BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;

    public void setBooks(BookStoreRequest bookStoreRequest) {
        BookStore bookStore = new BookStore();
        bookStore.setBookid(bookStoreRequest.getBookid());
        bookStore.setBookname(bookStoreRequest.getBookname());
        bookStore.setAuthorname(bookStoreRequest.getAuthorname());
        bookStoreRepository.save(bookStore);
    }
    public List<BookStore> getAllBooks(){
        return bookStoreRepository.findAll();
    }
}
