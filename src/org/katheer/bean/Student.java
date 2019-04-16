package org.katheer.bean;

public class Student {
    private String name;
    private String regNo;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showStudentDetails() {
        System.out.println("Name    : " + this.getName());
        System.out.println("Reg No  : " + this.getRegNo());
        System.out.println("Address :");
        address.showAddress();
    }
}
