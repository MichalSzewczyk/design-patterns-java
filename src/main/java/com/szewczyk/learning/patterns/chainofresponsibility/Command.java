package com.szewczyk.learning.patterns.chainofresponsibility;

public interface Command {
    CommandType getCommandType();

    void command();
}
