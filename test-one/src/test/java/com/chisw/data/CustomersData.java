package com.chisw.data;

public class CustomersData {

    private final String firstName;
    private final String secondName;
    private final String company;


    public CustomersData(String firstName, String secondName, String company) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getCompany() {
        return company;
    }
}
