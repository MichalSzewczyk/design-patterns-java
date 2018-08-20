package com.szewczyk.learning.patterns.afactory;

public class CarRentalClient {
    private final CarRental carRental;

    public CarRentalClient(CarRental carRental) {
        this.carRental = carRental;
    }

    void goForShopping() {
        carRental.rentTransporter();
    }

    void goForHolidays() {
        carRental.rentCabriolet();
    }
}
