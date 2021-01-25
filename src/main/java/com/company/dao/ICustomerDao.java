package main.java.com.company.dao;

import main.java.com.company.model.Customer;

public interface ICustomerDao {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
