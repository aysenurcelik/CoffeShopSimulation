package Company;

public class CampaignDao implements ICampaignDao {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya dbye eklendi");
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
