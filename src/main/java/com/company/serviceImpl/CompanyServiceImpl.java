package main.java.com.company.serviceImpl;

import main.java.com.company.service.ICompanyService;
import main.java.com.company.dao.ICompanyDao;
import main.java.com.company.model.Company;
import main.java.com.company.service.ValidateServiceImpl;

import javax.xml.validation.Validator;

public class CompanyServiceImpl implements ICompanyService {
    private ICompanyDao companyDao;
    private ValidateServiceImpl validator;
    public CompanyServiceImpl(ICompanyDao companyDao,ValidateServiceImpl validator) {

        this.companyDao = companyDao;
        this.validator =validator;
    }

    @Override
    public void add(Company company) {
        if(validator.validate(company)) {

            companyDao.add(company);
        }
    }


}
