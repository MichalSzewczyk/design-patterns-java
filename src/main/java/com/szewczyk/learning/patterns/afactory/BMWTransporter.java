package com.szewczyk.learning.patterns.afactory;

public class BMWTransporter implements Transporter {
    @Override
    public void transport() {
        System.out.println("Transporting in BMW.");
    }

    @Override
    public void drive() {
        System.out.println("Driving BMW transporter.");
    }
}
