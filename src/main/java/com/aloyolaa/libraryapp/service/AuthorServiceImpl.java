package com.aloyolaa.libraryapp.service;

import com.aloyolaa.libraryapp.entity.Author;
import com.aloyolaa.libraryapp.repository.AuthorRepository;
import com.aloyolaa.libraryapp.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, Long> implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(BaseRepository<Author, Long> baseRepository) {
        super(baseRepository);
    }
}
