package org.klukasz.customer.service;

import org.klukasz.customer.model.Customer;
import org.klukasz.customer.model.CustomerDTO;
import org.klukasz.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerDTO> getCustomers() {
        List<CustomerDTO> customers = new ArrayList<>();

        for (Customer customer : customerRepository.findAll()) {
            customers.add(CustomerDTO.of(customer));
        }

        return customers;
    }

    public CustomerDTO getCustomer(String customerCode) {
        return CustomerDTO.of(customerRepository.findByCustomerCode(customerCode));
    }
}
