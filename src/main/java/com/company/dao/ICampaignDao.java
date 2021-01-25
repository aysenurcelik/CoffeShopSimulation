package main.java.com.company.dao;

import main.java.com.company.model.Campaign;

public interface ICampaignDao {
    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
}
