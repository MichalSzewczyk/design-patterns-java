package com.szewczyk.learning.patterns.mediator;

public final class User {
    private final MessageBroker messageBroker;

    public User(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    final void joinChatRoom(String chatRoomName) {
        this.messageBroker.joinChatRoom(chatRoomName, this);
    }

    final void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

    final void sendMessage(String chatRoom, String message) {
        this.messageBroker.broadcastMessage(chatRoom, message);
    }
}
