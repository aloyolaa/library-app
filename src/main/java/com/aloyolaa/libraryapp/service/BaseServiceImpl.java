package com.aloyolaa.libraryapp.service;

import com.aloyolaa.libraryapp.entity.BaseEntity;
import com.aloyolaa.libraryapp.repository.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {
    protected final BaseRepository<E, ID> baseRepository;

    @Override
    @Transactional(readOnly = true)
    public List<E> findAll() throws Exception {
        try {
            return baseRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public E findById(ID id) throws Exception {
        try {
            return baseRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                return baseRepository.save(entity);
            } else {
                throw new EntityNotFoundException();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new EntityNotFoundException();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
