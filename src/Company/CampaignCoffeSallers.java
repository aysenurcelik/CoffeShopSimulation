package Company;

public class CampaignCoffeSallers implements ICampaignIntegration{
    @Override
    public void applyPointCampaign(Customer customer) {
        System.out.println("Yıldız kazandınız!");
    }
}
