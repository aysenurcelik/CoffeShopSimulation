package main.java.com.company.serviceImpl;

import main.java.com.company.service.ICustomerService;
import main.java.com.company.dao.ICustomerDao;
import main.java.com.company.model.Customer;
import main.java.com.company.service.ValidateServiceImpl;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerDao customerDao;

    public CustomerServiceImpl(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void addCustomer(Customer customer) {

            customerDao.addCustomer(customer);

    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDao.deleteCustomer(customer);
    }
}

