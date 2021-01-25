package main.java.com.company.daoImpl;

import main.java.com.company.model.Company;
import main.java.com.company.dao.ICompanyDao;

public class CompanyDaoImpl implements ICompanyDao {
    @Override
    public void add(Company company) {
        System.out.println("Company Added!");
    }
}
