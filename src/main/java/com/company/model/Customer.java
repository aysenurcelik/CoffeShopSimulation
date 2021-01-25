package main.java.com.company.model;

public class Customer {
    private String customerName;
    private String  customerSurname;
    private Long birthDate;
    private String tckNo;


    public Customer(String customerName, String customerSurname, Long birthDate, String tckNo) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.birthDate = birthDate;
        this.tckNo = tckNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public String getTckNo() {
        return tckNo;
    }

    public void setTckNo(String tckNo) {
        this.tckNo = tckNo;
    }
}
