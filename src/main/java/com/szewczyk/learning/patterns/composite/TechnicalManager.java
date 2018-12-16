package com.szewczyk.learning.patterns.composite;

import java.util.Collection;
import java.util.LinkedList;

public final class TechnicalManager implements Employee, Manager {
    private final Collection<Employee> subordinates;

    public TechnicalManager() {
        this.subordinates = new LinkedList<>();
    }

    @Override
    public final void askToWorkOn(String task) {
        System.out.println("Dispatching task to subordinates.");
        subordinates.forEach(subordinate -> subordinate.askToWorkOn(task));
    }

    @Override
    public final void addSubordinate(Employee subordinate) {
        this.subordinates.add(subordinate);
    }
}
