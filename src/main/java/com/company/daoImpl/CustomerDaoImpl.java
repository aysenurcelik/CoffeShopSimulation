package main.java.com.company.daoImpl;

import main.java.com.company.model.Customer;
import main.java.com.company.dao.ICustomerDao;

public class CustomerDaoImpl implements ICustomerDao {
    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Müşteri eklendi");
    }

    @Override
    public void updateCustomer(Customer customer) {
        System.out.println("Müşteri güncellendi");
    }

    @Override
    public void deleteCustomer(Customer customer) {
        System.out.println("Müşteri silindi");
    }
}
