package com.aloyolaa.libraryapp.service;

import com.aloyolaa.libraryapp.entity.Customer;
import com.aloyolaa.libraryapp.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements BaseService<Customer> {
    private final CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() throws Exception {
        try {
            return customerRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findById(Long id) throws Exception {
        try {
            return customerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Customer save(Customer customer) throws Exception {
        try {
            return customerRepository.save(customer);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Customer update(Long id, Customer customer) throws Exception {
        try {
             Customer customerById = customerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
             customerById.setFirstName(customer.getFirstName());
             customerById.setLastName(customer.getLastName());
             customerById.setDni(customer.getDni());
             return customerRepository.save(customerById);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (customerRepository.existsById(id)) {
                customerRepository.deleteById(id);
                return true;
            } else {
                throw new EntityNotFoundException();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
