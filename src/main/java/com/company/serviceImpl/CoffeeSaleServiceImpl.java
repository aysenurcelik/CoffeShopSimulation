package main.java.com.company.serviceImpl;

import main.java.com.company.model.Customer;
import main.java.com.company.service.ICoffeeSale;

public class CoffeeSaleServiceImpl implements ICoffeeSale {
   private ICoffeeSale coffeeSale;

    // CoffeeSaleDaoImpl olustur Sysout alanı dao icine alınabilir
    @Override
    public void sell(Customer customer) {
        System.out.println("Kahve Satışı gerçekleşti");
    }
}
