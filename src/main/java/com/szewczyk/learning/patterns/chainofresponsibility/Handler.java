package com.szewczyk.learning.patterns.chainofresponsibility;

public interface Handler {
    void handle(Command command);
}
