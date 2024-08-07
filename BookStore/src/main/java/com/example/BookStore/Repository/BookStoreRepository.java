package com.example.BookStore.Repository;

import com.example.BookStore.entity.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepository extends JpaRepository<BookStore, Long> {

}
