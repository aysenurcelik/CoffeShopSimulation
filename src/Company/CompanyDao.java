package Company;

public class CompanyDao implements ICompanyDao{
    @Override
    public void add(Company company) {
        System.out.println("Company Added!");
    }
}
