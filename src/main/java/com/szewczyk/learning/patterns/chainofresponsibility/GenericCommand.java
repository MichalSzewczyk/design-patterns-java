package com.szewczyk.learning.patterns.chainofresponsibility;

import static java.lang.String.format;

public final class GenericCommand implements Command {
    private final CommandType commandType;

    public GenericCommand(CommandType commandType) {
        this.commandType = commandType;
    }

    @Override
    public final CommandType getCommandType() {
        return commandType;
    }

    @Override
    public final void command() {
        System.out.println(format("Executed command.[commandType=%s]", commandType));
    }
}
