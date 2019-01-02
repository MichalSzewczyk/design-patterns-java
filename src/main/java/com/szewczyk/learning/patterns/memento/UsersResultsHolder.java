package com.szewczyk.learning.patterns.memento;

import java.util.HashMap;
import java.util.Map;

public class UsersResultsHolder {
    private Map<String, Long> usersResults;

    void addUser(String userName) {
        usersResults.put(userName, 0L);
    }

    void updatePointsForUser(String userName, long points) {
        usersResults.put(userName, points);
    }

    State dumpState() {
        return new State(new HashMap<>(usersResults));
    }

    void loadState(State state) {
        this.usersResults = state.getUsersResults();
    }
}
