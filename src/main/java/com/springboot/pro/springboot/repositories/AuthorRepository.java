package com.springboot.pro.springboot.repositories;

import com.springboot.pro.springboot.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
