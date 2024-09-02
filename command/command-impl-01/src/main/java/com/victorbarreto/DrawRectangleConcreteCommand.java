package com.victorbarreto;

public class DrawRectangleConcreteCommand implements Command {
    DrawShape drawShape;

    public DrawRectangleConcreteCommand(DrawShape draw) {
        if (draw == null) {
            throw new NullPointerException("DrawShape cannot be null");
        }
        this.drawShape = draw;
    }

    @Override
    public void execute() {
        this.drawShape.drawRectangle();
    }
}
