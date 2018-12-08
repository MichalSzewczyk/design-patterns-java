package com.szewczyk.learning.patterns.multiton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class SessionState {
    private static final Map<String, SessionState> SESSION_STATES = new ConcurrentHashMap<>();
    private String state;

    private SessionState() {
    }

    public static SessionState getSessionState(String sessionId) {
        return SESSION_STATES.computeIfAbsent(sessionId, __ -> new SessionState());
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }
}
