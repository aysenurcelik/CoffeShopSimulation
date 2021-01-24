package Company;

public class CustomerDao implements ICustomerDao {
    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Müşteri eklendi");
    }

    @Override
    public void updateCustomer(Customer customer) {
        System.out.println("Müşteri güncellendi");
    }

    @Override
    public void deleteCustomer(Customer customer) {
        System.out.println("Müşteri silindi");
    }
}
