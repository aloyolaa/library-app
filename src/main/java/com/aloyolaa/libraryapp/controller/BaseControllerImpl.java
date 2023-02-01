package com.aloyolaa.libraryapp.controller;

import com.aloyolaa.libraryapp.entity.BaseEntity;
import com.aloyolaa.libraryapp.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseService<E, Long>> implements BaseController<E, Long> {
    protected final S service;

    @GetMapping("/")
    public ResponseEntity<List<E>> getAll() {
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> getOne(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<E> save(@RequestBody E entity) {
        try {
            return new ResponseEntity<>(service.save(entity), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<E> update(@PathVariable Long id, @RequestBody E entity) {
        try {
            return new ResponseEntity<>(service.update(id, entity), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
