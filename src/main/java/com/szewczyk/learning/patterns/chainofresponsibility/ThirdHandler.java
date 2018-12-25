package com.szewczyk.learning.patterns.chainofresponsibility;

import static java.lang.String.format;

public final class ThirdHandler implements Handler {

    @Override
    public final void handle(Command command) {
        if (isHandlingSupported(command)) {
            System.out.println(format("Handling command. %s", command.getCommandType()));
        } else {
            System.out.println(format("Command not handled. %s", command.getCommandType()));
        }
    }

    private boolean isHandlingSupported(Command command) {
        return CommandType.THIRD.equals(command.getCommandType());
    }
}
