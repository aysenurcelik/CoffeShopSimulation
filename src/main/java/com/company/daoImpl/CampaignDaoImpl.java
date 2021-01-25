package main.java.com.company.daoImpl;

import main.java.com.company.model.Campaign;
import main.java.com.company.dao.ICampaignDao;

public class CampaignDaoImpl implements ICampaignDao {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi");

    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya dbde güncellendi");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya dbde silindi");
    }
}
