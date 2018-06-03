package com.szewczyk.learning.patterns.observer;

import com.szewczyk.learning.patterns.common.Output;

public class ConsoleDisplayDevice implements DisplayDevice {
    private final Output output;
    private final Object monitor = new Object();
    private WeatherData displayData;

    public ConsoleDisplayDevice(Output output, WeatherData displayData) {
        this.output = output;
        this.displayData = displayData;
    }

    @Override
    public void display() {
        synchronized (monitor) {
            Thread displayingThread = new Thread(this::displayContinually);
            displayingThread.setDaemon(true);
            displayingThread.start();
        }
    }

    @Override
    public void update(WeatherData data) {
        synchronized (monitor) {
            displayData.update(data);
        }
    }

    private void displayContinually() {
        while (true) {
            output.print(displayData.getValue());
        }
    }
}
