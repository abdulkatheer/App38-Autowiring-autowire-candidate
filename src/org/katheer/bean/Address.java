package org.katheer.bean;

public class Address {
    private String firstLine;
    private String secondLine;
    private String pin;

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void showAddress() {
        System.out.println(this.getFirstLine() + ",\n" + this.getSecondLine() + ",\nPIN : " + this.getPin() + ".");

    }
}
