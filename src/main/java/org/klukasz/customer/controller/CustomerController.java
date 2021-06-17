package org.klukasz.customer.controller;

import org.klukasz.customer.model.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public List<CustomerDTO> getCustomers() {
        List<CustomerDTO> customers = new ArrayList<>();
        customers.add(new CustomerDTO(1L, "COCA-COLA", "Coca Cola"));

        return customers;
    }
}
