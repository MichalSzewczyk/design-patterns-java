package com.szewczyk.learning.patterns.afactory;

public class BMWCarRental implements CarRental {
    @Override
    public Cabriolet rentCabriolet() {
        return new BMWCabriolet();
    }

    @Override
    public Transporter rentTransporter() {
        return new BMWTransporter();
    }
}
