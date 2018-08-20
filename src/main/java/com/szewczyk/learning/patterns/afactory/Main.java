package com.szewczyk.learning.patterns.afactory;

public class Main {
    public static void main(String[] args) {
        Driver driver = new CarRentalClient(new BMWCarRental());
        driver.goForHolidays();
        driver.goForShopping();
    }
}
