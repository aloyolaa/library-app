package com.aloyolaa.libraryapp.controller;

import com.aloyolaa.libraryapp.entity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface BaseController<E extends BaseEntity, ID extends Serializable> {
    ResponseEntity<List<E>> getAll();

    ResponseEntity<E> getOne(@PathVariable ID id);

    ResponseEntity<E> save(@RequestBody E entity);

    ResponseEntity<E> update(@PathVariable ID id, @RequestBody E entity);

    ResponseEntity<Boolean> delete(@PathVariable ID id);
}
