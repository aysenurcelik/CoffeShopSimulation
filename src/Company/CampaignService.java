package Company;

public class CampaignService implements ICampaignService{
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi");
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
