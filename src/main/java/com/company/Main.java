package main.java.com.company;


import main.java.com.company.model.Company;
import main.java.com.company.serviceImpl.CustomerServiceImpl;
import main.java.com.company.daoImpl.CustomerDaoImpl;
import main.java.com.company.model.Customer;
public class Main {

    public static void main(String[] args) {
        Company starbucks = new Company(1,"Starbucks");
        Company nero = new Company(2, "nero");
       /* CompanyService companyService = new CompanyService(new CompanyDao());
        Company company = new Company();
        company.setCompanyName("ayse");
        company.setCompanyId(3);
        companyService.add(company);*/

        /*CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomerDaoImpl());
        Customer customer = new Customer("ayse","celik");
        customer.setCustomerName("nur");
        customer.setCustomerSurname("celik");
        customerService.addCustomer(customer);*/

    }
}
