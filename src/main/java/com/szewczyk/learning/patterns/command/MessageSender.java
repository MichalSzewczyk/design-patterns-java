package com.szewczyk.learning.patterns.command;

import static java.lang.String.format;

public final class MessageSender {
    final void sendMessage(String message) {
        System.out.println(format("Sending message. [message=%s]", message));
    }
}
