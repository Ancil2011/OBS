package com.testangular.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.testangular.obs.entity.Book;
import com.testangular.obs.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategorypath", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
