package com.company;


import Company.Company;
import Company.CompanyDao;
import Company.CompanyService;
import Company.CustomerService;
import Company.CustomerDao;
import Company.Customer;
public class Main {

    public static void main(String[] args) {
       /* CompanyService companyService = new CompanyService(new CompanyDao());
        Company company = new Company();
        company.setCompanyName("ayse");
        company.setCompanyId(3);
        companyService.add(company);*/

        CustomerService customerService = new CustomerService(new CustomerDao());
        Customer customer = new Customer();
        customer.setCustomerName("nur");
        customer.setCustomerSurname("celik");
        customerService.addCustomer(customer);

    }
}
