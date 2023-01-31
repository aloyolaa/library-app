package com.aloyolaa.libraryapp.service;

import java.util.List;

public interface BaseService<E> {
    List<E> findAll() throws Exception;

    E findById(Long id) throws Exception;

    E save(E e) throws Exception;

    E update(Long id, E e) throws Exception;

    boolean delete(Long id) throws Exception;
}
