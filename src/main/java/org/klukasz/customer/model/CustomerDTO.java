package org.klukasz.customer.model;

public class CustomerDTO {
    private Long id;
    private String code;
    private String name;

    public CustomerDTO() {

    }

    public static CustomerDTO of(Customer customer) {
        return new CustomerDTO(customer.getId(), customer.getCode(), customer.getName());
    }

    private CustomerDTO(Long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
