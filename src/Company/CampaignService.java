package Company;

public class CampaignService implements ICampaignService {

    ICampaignDao campaignDao;

    public CampaignService(ICompanyDao companyDao) {
        this.campaignDao = campaignDao;
    }

    @Override
    public void addCampaign(Company company) {

        campaignDao.addCampaign(company);
    }

    @Override
    public void deleteCampaign(Company company) {

    }

    @Override
    public void updateCampaign(Company company) {

    }
}
