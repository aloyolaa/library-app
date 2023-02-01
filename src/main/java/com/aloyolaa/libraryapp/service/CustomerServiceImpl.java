package com.aloyolaa.libraryapp.service;

import com.aloyolaa.libraryapp.entity.Customer;
import com.aloyolaa.libraryapp.repository.BaseRepository;
import com.aloyolaa.libraryapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, Long> implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(BaseRepository<Customer, Long> baseRepository) {
        super(baseRepository);
    }
}
