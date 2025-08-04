package com.ozmenyavuz.service;

import com.ozmenyavuz.dto.CustomerDto;
import com.ozmenyavuz.dto.CustomerIU;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    CustomerDto createCustomer(CustomerIU customerIU);

    CustomerDto getCustomerById(Long customerId);

    List<CustomerDto> getAllCustomers();

    CustomerDto updateCustomer(Long customerId, CustomerIU customerIU);

    void deleteCustomer(Long customerId);


}