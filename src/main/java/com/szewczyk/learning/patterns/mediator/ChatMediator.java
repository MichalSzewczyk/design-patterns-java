package com.szewczyk.learning.patterns.mediator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class ChatMediator implements MessageBroker {
    private final Map<String, Collection<User>> chatRoomsToUsersMapping;

    public ChatMediator() {
        chatRoomsToUsersMapping = new HashMap<>();
    }

    @Override
    public final void joinChatRoom(String chatRoomName, User user) {
        Collection<User> users = chatRoomsToUsersMapping.computeIfAbsent(chatRoomName, __ -> new ArrayList<>());
        users.add(user);
    }

    @Override
    public final void broadcastMessage(String chatRoom, String message) {
        chatRoomsToUsersMapping.get(chatRoom).stream().forEach(user -> user.receiveMessage(message));
    }
}
