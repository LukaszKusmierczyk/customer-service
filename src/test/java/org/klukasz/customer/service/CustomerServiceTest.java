package org.klukasz.customer.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.klukasz.customer.model.Customer;
import org.klukasz.customer.model.CustomerDTO;
import org.klukasz.customer.repository.CustomerRepository;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class CustomerServiceTest {

    private static final String CODE = "Coca-Cola";
    private static final long ID = 100;
    private static final String NAME = "Coca Cola inc.";

    @Mock
    private CustomerRepository customerRepository;

    private Customer customer;

    private CustomerService customerService;

    private CustomerDTO customerDTO;

    @BeforeEach
    public void initEach() {
        customerService = new CustomerService(customerRepository);
        customer = new Customer();
        customer.setId(ID);
        customer.setCode(CODE);
        customer.setName(NAME);
    }

    @Test
    void should_return_customer() {
        //given
        when(customerRepository.findByCustomerCode(any())).thenReturn(customer);

        //when
        CustomerDTO customerDTO = customerService.getCustomer("c001");

        //then
        assertEquals(CODE, customerDTO.getCode());
        assertEquals(ID, customerDTO.getId());
        assertEquals(NAME, customerDTO.getName());
    }
}
