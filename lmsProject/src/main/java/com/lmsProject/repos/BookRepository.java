package com.lmsProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmsProject.model.Book;



public interface BookRepository extends JpaRepository<Book, Long> {

}
