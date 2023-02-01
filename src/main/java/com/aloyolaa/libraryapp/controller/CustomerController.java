package com.aloyolaa.libraryapp.controller;

import com.aloyolaa.libraryapp.entity.Customer;
import com.aloyolaa.libraryapp.service.CustomerService;
import com.aloyolaa.libraryapp.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@CrossOrigin(origins = "*")
public class CustomerController extends BaseControllerImpl<Customer, CustomerService> {
    public CustomerController(CustomerServiceImpl service) {
        super(service);
    }
}
