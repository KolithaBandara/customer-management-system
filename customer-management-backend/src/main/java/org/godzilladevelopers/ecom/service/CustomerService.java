package org.godzilladevelopers.ecom.service;

import org.godzilladevelopers.ecom.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {
    public List<Object> getCustomer(){
        Customer customer = new Customer();

        customer.setId("C0001");
        customer.setName("Johnathan");
        customer.setAddress("California");
        customer.setContact("0893490345");
        customer.setEmail("john.silvester@gmail.com");

        List<Object> customerList = Arrays.asList(customer);
        return customerList;

    }
}
