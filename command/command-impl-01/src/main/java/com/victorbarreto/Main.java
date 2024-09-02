package com.victorbarreto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SketchBoard sketchBoard = new SketchBoard();

        DrawShape drawShape = new DrawShape();
        Command drawCircle = new DrawCircleConcreteCommand(drawShape);
        sketchBoard.setCommand(drawCircle);

        sketchBoard.draw();

        drawCircle = new DrawSquareConcreteCommand(drawShape);
        sketchBoard.setCommand(drawCircle);
        sketchBoard.draw();
    }
}