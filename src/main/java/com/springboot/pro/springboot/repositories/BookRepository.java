package com.springboot.pro.springboot.repositories;

import com.springboot.pro.springboot.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
