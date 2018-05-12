package com.springboot.pro.springboot.repositories;

import com.springboot.pro.springboot.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
