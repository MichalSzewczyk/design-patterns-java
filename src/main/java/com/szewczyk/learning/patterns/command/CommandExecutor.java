package com.szewczyk.learning.patterns.command;

public final class CommandExecutor {
    private final CommandProducer commandProducer;

    public CommandExecutor(CommandProducer commandProducer) {
        this.commandProducer = commandProducer;
    }

    final void executeCommands() {
        Command sendMessageCommand = commandProducer.getSendMessageCommand("Any message");
        sendMessageCommand.execute();
    }
}
