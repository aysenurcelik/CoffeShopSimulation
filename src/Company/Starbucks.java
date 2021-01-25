package Company;

public class Starbucks implements ICoffeSaller,ICampaignIntegration,IConfirmation {
    private int star;
    private Campaign campaign;
    private Customer customer;


    @Override
    public void sell(Customer customer) { }

    @Override
    public void applyPointCampaign(Customer customer) {

    }

    @Override
    public void correct(Customer customer) {
        System.out.println("Edevlet ile onaylandı");
    }
}
