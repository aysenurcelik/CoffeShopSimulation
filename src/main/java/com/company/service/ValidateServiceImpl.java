package main.java.com.company.service;

import main.java.com.company.model.Company;


public class ValidateServiceImpl implements ICompanyValidate {
    @Override
    public boolean validate(Company company){
        boolean result = true;
        if("Startbucks".equals(company.getCompanyName())){
            System.out.println("E devlet validator edildi");
            return result;
        }

        return result;
    }
}
