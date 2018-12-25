package com.szewczyk.learning.patterns.command;

public interface CommandProducer {
    Command getSendMessageCommand(String message);
}
