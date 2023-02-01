package com.aloyolaa.libraryapp.controller;

import com.aloyolaa.libraryapp.entity.Author;
import com.aloyolaa.libraryapp.service.AuthorService;
import com.aloyolaa.libraryapp.service.AuthorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authors")
@CrossOrigin(origins = "*")
public class AuthorController extends BaseControllerImpl<Author, AuthorService> {
    public AuthorController(AuthorServiceImpl service) {
        super(service);
    }
}
