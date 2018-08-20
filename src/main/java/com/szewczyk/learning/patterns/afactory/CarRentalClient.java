package com.szewczyk.learning.patterns.afactory;

public class CarRentalClient implements Driver {
    private final CarRental carRental;

    public CarRentalClient(CarRental carRental) {
        this.carRental = carRental;
    }

    @Override
    public void goForShopping() {
        Transporter transporter = carRental.rentTransporter();
        transporter.transport();
        transporter.drive();
    }

    @Override
    public void goForHolidays() {
        Cabriolet cabriolet = carRental.rentCabriolet();
        cabriolet.openRoof();
        cabriolet.drive();
    }
}
