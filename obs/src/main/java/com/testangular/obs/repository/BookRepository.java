package com.testangular.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testangular.obs.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
