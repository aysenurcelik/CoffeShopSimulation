package main.java.com.company;

import main.java.com.company.model.Campaign;
import main.java.com.company.model.Company;
import main.java.com.company.model.Customer;
import main.java.com.company.service.ICampaignIntegration;
import main.java.com.company.service.ICoffeeSale;
import main.java.com.company.service.ICompanyValidate;

public class Starbucks implements ICoffeeSale, ICampaignIntegration, ICompanyValidate {
    private int star;
    private Campaign campaign;
    private Customer customer;


    @Override
    public void sell(Customer customer) { }

    @Override
    public void applyPointCampaign(Customer customer) {

    }

    @Override
    public boolean validate(Company company) {
        return true;
    }
}
