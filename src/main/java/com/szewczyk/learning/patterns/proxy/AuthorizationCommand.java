package com.szewczyk.learning.patterns.proxy;

public final class AuthorizationCommand implements Command {
    @Override
    public final void execute() {
        System.out.println("Authorization started.");
    }
}
