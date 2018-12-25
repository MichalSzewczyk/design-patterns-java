package com.szewczyk.learning.patterns.command;

public final class SendMessageCommand implements Command {
    private final String message;
    private final MessageSender messageSender;

    public SendMessageCommand(String message, MessageSender messageSender) {
        this.message = message;
        this.messageSender = messageSender;
    }

    @Override
    public final void execute() {
        this.messageSender.sendMessage(this.message);
    }
}
