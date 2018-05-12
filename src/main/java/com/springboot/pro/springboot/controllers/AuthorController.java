package com.springboot.pro.springboot.controllers;

import com.springboot.pro.springboot.model.Author;
import com.springboot.pro.springboot.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }

    @PostMapping("/authors")
    public Map getAuthorsGetMethod(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return model.asMap();
    }

}
