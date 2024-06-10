package br.faccat.padarqsis.customerregistry.service;

import br.faccat.padarqsis.customerregistry.model.CustomerModel;
import br.faccat.padarqsis.customerregistry.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerModel createCustomer(CustomerModel customer) {
        return customerRepository.save(customer);
    }

    public List<CustomerModel> listCustomers() {
        return customerRepository.findAll();
    }

    public CustomerModel getCustomerById(String id) {
        var optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new RuntimeException("Customer not found");
        } else {
            return optionalCustomer.get();
        }
    }

    public CustomerModel updateCustomer(String id, CustomerModel customer) {
        var optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new RuntimeException("Customer not found");
        } else {
            customer.setId(id);
            return customerRepository.save(customer);
        }
    }

    public void deleteCustomer(String id) {
        var optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new RuntimeException("Customer not found");
        } else {
            customerRepository.deleteById(id);
        }
    }
}
