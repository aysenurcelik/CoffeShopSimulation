package Company;

public class Starbucks extends ISales implements ICompany {
    private int star;


    @Override
    public void sell(Customer customer) {}

    @Override
    public void applyCampaign(Company company) {
        System.out.println("Yıldız Kazandınız");
    }


}
