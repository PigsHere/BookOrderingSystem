package models;

public class CustomersInfo {

    // CUSTOMER DATA SECTION
    private String customerName;
    private String customerEmail;
    private String customerCity;
    private String customerResidentNo;
    private int customerNumber;

    public CustomersInfo(String customerName, String customerEmail, String customerCity, String customerResidentNo, int customerNumber) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerCity = customerCity;
        this.customerResidentNo = customerResidentNo;
        this.customerNumber = customerNumber;
    }

    // GETTER SECTION
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public String getCustomerResidentNo() {
        return customerResidentNo;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    // SETTER SECTION
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public void setCustomerResidentNo(String customerResidentNo) {
        this.customerResidentNo = customerResidentNo;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
