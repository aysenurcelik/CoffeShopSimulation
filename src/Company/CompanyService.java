package Company;

public class CompanyService implements ICompanyService{
    ICompanyDao companyDao;

    public CompanyService(ICompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public void add(Company company) {
        companyDao.add(company);
    }


}
