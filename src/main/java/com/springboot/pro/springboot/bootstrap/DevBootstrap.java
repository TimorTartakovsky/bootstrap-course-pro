package com.springboot.pro.springboot.bootstrap;

import com.springboot.pro.springboot.model.Author;
import com.springboot.pro.springboot.model.Book;
import com.springboot.pro.springboot.model.Publisher;
import com.springboot.pro.springboot.repositories.AuthorRepository;
import com.springboot.pro.springboot.repositories.BookRepository;
import com.springboot.pro.springboot.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        this.initData();
    }

    private void initData() {
        Publisher pub1 = new Publisher();
        pub1.setName("Publisher 1");

        publisherRepository.save(pub1);

        Author timor = new Author("Teymur", "Tartakovsky");
        Book book1 = new Book("My life", "1234", pub1);
        timor.getBooks().add(book1);
        book1.getAuthors().add(timor);

        authorRepository.save(timor);
        bookRepository.save(book1);

        Author rod = new Author("Rod", "Johnson");
        Book book2 = new Book("J2EE Development without EJB", "1235", pub1);
        rod.getBooks().add(book2);

        authorRepository.save(rod);
        bookRepository.save(book2);
    }
}
