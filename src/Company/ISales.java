package Company;

import Company.Customer;

public abstract class ISales {
 public abstract void applyCampaign(Company company); //kampanya uygulanması company özgü

public void sell(Customer customer){ //kahve satışı customerla ilişkili

 System.out.println("Satış yapıldı");
        }
}
