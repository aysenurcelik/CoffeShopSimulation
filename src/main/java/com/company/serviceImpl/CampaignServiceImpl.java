package main.java.com.company.serviceImpl;

import main.java.com.company.dao.ICampaignDao;
import main.java.com.company.daoImpl.CampaignDaoImpl;
import main.java.com.company.model.Campaign;
import main.java.com.company.service.ICampaignService;

public class CampaignServiceImpl implements ICampaignService {
    private ICampaignDao campaignDao;


    @Override
    public void addCampaign(Campaign campaign) {
        campaignDao.addCampaign(campaign);

    }
    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya güncellendi");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya silindi");
    }
}
