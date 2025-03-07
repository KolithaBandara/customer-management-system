package org.godzilladevelopers.ecom.controller;

import lombok.RequiredArgsConstructor;
import org.godzilladevelopers.ecom.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService customerService;

    @GetMapping("/details")
    List<Object> getCustomer(){
        return customerService.getCustomer();
    }
}
