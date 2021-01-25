package main.java.com.company.service;

import main.java.com.company.model.Campaign;

public interface ICampaignService {
    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
}
