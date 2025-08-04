package com.ozmenyavuz.service;


import com.ozmenyavuz.dto.CustomerDto;
import com.ozmenyavuz.dto.CustomerIU;
import com.ozmenyavuz.entity.CustomerEntity;
import com.ozmenyavuz.mapper.CustomerMapper;
import com.ozmenyavuz.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }


    @Override
    public CustomerDto createCustomer(CustomerIU customerIU) {

      CustomerEntity customer =  customerMapper.toEntity(customerIU);
      CustomerEntity savedCustomer = customerRepository.save(customer);
        return customerMapper.toDto(savedCustomer);
    }

    @Override
    public CustomerDto getCustomerById(Long customerId) {

        CustomerEntity customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        return customerMapper.toDto(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {

        List<CustomerEntity> customers = customerRepository.findAll();

        return customers.stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList()); // stramde gelen tum Dtolariu listeye ceviri
    }

    @Override
    public CustomerDto updateCustomer(Long customerId, CustomerIU customerIU) {
        CustomerEntity existingCustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        existingCustomer.setFirstName(customerIU.getFirstName());
        existingCustomer.setLastName(customerIU.getLastName());
        existingCustomer.setEmail(customerIU.getEmail());
        existingCustomer.setNationalId(customerIU.getNationalId());

        CustomerEntity updateCustomer = customerRepository.save(existingCustomer);
        return customerMapper.toDto(updateCustomer);
    }

    @Override
    public void deleteCustomer(Long customerId) {

        CustomerEntity customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not fount"));

        customerRepository.delete(customer);
    }

}