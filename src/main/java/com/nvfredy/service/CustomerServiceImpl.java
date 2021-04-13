package com.nvfredy.service;

import com.nvfredy.domain.Customer;
import com.nvfredy.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer getOneById(Long id) {
        return repository.getOne(id);
    }

    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }

    public List<Customer> search(String keyword) {
        return repository.search(keyword);
    }

}
