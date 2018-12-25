package com.szewczyk.learning.patterns.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Handler thirdHandler = new ThirdHandler();
        Handler secondHandler = new SecondHandler(thirdHandler);
        Handler firstHandler = new FirstHandler(secondHandler);

        Command command = new GenericCommand(CommandType.THIRD);

        firstHandler.handle(command);
    }
}
