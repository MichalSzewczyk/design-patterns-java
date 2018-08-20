package com.szewczyk.learning.patterns.afactory;

public class FiatCarRental implements CarRental {
    @Override
    public Cabriolet rentCabriolet() {
        return new FiatCabriolet();
    }

    @Override
    public Transporter rentTransporter() {
        return new FiatTransporter();
    }
}
