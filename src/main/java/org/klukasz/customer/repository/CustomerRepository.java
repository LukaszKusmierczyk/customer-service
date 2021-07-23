package org.klukasz.customer.repository;

import org.klukasz.customer.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c where c.code = :code")
    Customer findByCustomerCode(@Param("code") String code);

}
