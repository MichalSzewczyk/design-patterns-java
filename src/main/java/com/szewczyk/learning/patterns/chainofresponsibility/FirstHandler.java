package com.szewczyk.learning.patterns.chainofresponsibility;

import static java.lang.String.format;

public final class FirstHandler implements Handler {
    private final Handler handler;

    public FirstHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public final void handle(Command command) {
        if (isHandlingSupported(command)) {
            System.out.println(format("Handling command. %s", command.getCommandType()));
        } else {
            System.out.println("Passing command to next handler.");
            handler.handle(command);
        }
    }

    private boolean isHandlingSupported(Command command) {
        return CommandType.FIRST.equals(command.getCommandType());
    }
}
