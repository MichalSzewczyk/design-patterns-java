package com.szewczyk.learning.patterns.proxy;

public final class AuthorizationCommandProxy implements Command {
    private final AuthorizationCommand authorizationCommand;

    public AuthorizationCommandProxy(AuthorizationCommand authorizationCommand) {
        this.authorizationCommand = authorizationCommand;
    }

    @Override
    public final void execute() {
        System.out.println("Logic before authorization command executed.");
        this.authorizationCommand.execute();
        System.out.println("Logic after authorization command executed.");
    }
}
