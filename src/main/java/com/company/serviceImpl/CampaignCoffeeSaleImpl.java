package main.java.com.company.serviceImpl;

import main.java.com.company.service.ICampaignIntegration;
import main.java.com.company.model.Customer;

public class CampaignCoffeeSaleImpl implements ICampaignIntegration {
    ICampaignIntegration iCampaignIntegration;
    @Override
    public void applyPointCampaign(Customer customer) {
        System.out.println("Yıldız kazandınız!");
    }
}
