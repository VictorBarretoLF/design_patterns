package com.victorbarreto;

public class DrawCircleConcreteCommand implements Command {
    DrawShape drawShape;

    public DrawCircleConcreteCommand(DrawShape draw) {
        if (draw == null) {
            throw new NullPointerException("DrawShape cannot be null");
        }
        this.drawShape = draw;
    }

    @Override
    public void execute() {
        this.drawShape.drawCircle();
    }

}
