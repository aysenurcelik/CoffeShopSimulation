package main.java.com.company.service;

import main.java.com.company.model.Customer;

public interface ICustomerService {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
