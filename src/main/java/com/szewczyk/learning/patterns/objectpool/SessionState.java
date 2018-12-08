package com.szewczyk.learning.patterns.objectpool;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Queue;

import static java.util.Objects.isNull;

public final class SessionState extends Observable {
    private static final Queue<SessionState> SESSION_STATES = new LinkedList<>();
    private String state;

    private SessionState() {
    }

    public final SessionState getSessionState() {
        SessionState sessionState = SESSION_STATES.poll();
        if (isNull(sessionState)) {
            return new SessionState();
        }
        return sessionState;
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }

    public final void recycle() {
        this.state = null;
        SESSION_STATES.add(this);
    }
}
