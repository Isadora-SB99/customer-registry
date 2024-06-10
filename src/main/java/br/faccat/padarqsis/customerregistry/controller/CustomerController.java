package br.faccat.padarqsis.customerregistry.controller;

import br.faccat.padarqsis.customerregistry.model.CustomerModel;
import br.faccat.padarqsis.customerregistry.service.CustomerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/create")
    public CustomerModel createCustomer(@Valid @RequestBody CustomerModel customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/list")
    public List<CustomerModel> listCustomers() {
        return customerService.listCustomers();
    }

    @GetMapping("/get/{id}")
    public CustomerModel getCustomerById(@PathVariable String id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping("/update/{id}")
    public CustomerModel updateCustomer(@PathVariable String id, @Valid @RequestBody CustomerModel customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
    }
}
