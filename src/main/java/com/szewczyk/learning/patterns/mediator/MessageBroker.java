package com.szewczyk.learning.patterns.mediator;

public interface MessageBroker {
    void joinChatRoom(String chatRoomName, User user);

    void broadcastMessage(String chatRoom, String message);
}
