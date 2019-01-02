package com.szewczyk.learning.patterns.memento;

import java.util.HashMap;
import java.util.Map;

public class State {
    private final Map<String, Long> usersResults;

    public State(Map<String, Long> usersResults) {
        this.usersResults = usersResults;
    }

    public Map<String, Long> getUsersResults() {
        return new HashMap<>(usersResults);
    }
}
