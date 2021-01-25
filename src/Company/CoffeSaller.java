package Company;

public class CoffeSaller implements ICoffeSaller{
    @Override
    public void sell(Customer customer) {
        System.out.println("Kahve Satışı gerçekleşti");
    }
}
