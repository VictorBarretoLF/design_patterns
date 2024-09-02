package com.victorbarreto;

public class SketchBoard {
    private Command command;

    public void setCommand(Command command) {
        if (command == null) {
            throw new NullPointerException("DrawShape cannot be null");
        }
        this.command = command;
    }

    public void draw() {
        this.command.execute();
    }

}
