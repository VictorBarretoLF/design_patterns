package com.victorbarreto;

public class DrawSquareConcreteCommand implements Command {
    DrawShape drawShape;

    public DrawSquareConcreteCommand(DrawShape draw) {
        if (draw == null) {
            throw new NullPointerException("DrawShape cannot be null");
        }
        this.drawShape = draw;
    }

    @Override
    public void execute() {
        this.drawShape.drawSquare();
    }

}
