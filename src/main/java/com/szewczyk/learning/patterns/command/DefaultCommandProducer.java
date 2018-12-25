package com.szewczyk.learning.patterns.command;

public final class DefaultCommandProducer implements CommandProducer {
    private final MessageSender messageSender;

    public DefaultCommandProducer() {
        messageSender = new MessageSender();
    }

    @Override
    public final Command getSendMessageCommand(String message) {
        return new SendMessageCommand(message, messageSender);
    }
}
