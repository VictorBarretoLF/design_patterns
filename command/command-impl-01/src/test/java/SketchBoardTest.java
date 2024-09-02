import com.victorbarreto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import static org.mockito.Mockito.mock;

class SketchBoardTest {

    @Test
    void setCommandShouldAssignCommand() {
        // Arrange
        SketchBoard sketchBoard = new SketchBoard();
        Command command = mock(Command.class);

        // Act
        sketchBoard.setCommand(command);
        sketchBoard.draw();

        // Assert
        BDDMockito.verify(command).execute();
    }

    @Test
    void drawCircleCommandExecutesDrawCircle() {
        // Arrange
        SketchBoard sketchBoard = new SketchBoard();
        DrawShape drawShape = BDDMockito.mock(DrawShape.class);
        Command drawCircleConcreteCommand = new DrawCircleConcreteCommand(drawShape);

        // Act
        sketchBoard.setCommand(drawCircleConcreteCommand);
        sketchBoard.draw();

        // Assert
        BDDMockito.verify(drawShape).drawCircle();
    }

    @Test
    void drawRectangleCommandExecutesDrawRectangle() {
        // Arrange
        SketchBoard sketchBoard = new SketchBoard();
        DrawShape drawShape = BDDMockito.mock(DrawShape.class);
        Command drawRectangleConcreteCommand = new DrawRectangleConcreteCommand(drawShape);

        // Act
        sketchBoard.setCommand(drawRectangleConcreteCommand);
        sketchBoard.draw();

        // Assert
        BDDMockito.verify(drawShape).drawRectangle();
    }

    @Test
    void drawSquareCommandExecutesDrawSquare() {
        // Arrange
        SketchBoard sketchBoard = new SketchBoard();
        DrawShape drawShape = BDDMockito.mock(DrawShape.class);
        Command drawSquareConcreteCommand = new DrawSquareConcreteCommand(drawShape);

        // Act
        sketchBoard.setCommand(drawSquareConcreteCommand);
        sketchBoard.draw();

        // Assert
        BDDMockito.verify(drawShape).drawSquare();
    }

    @Test
    void newSketchBoardWithNullCommandThrowsException() {
        // Act and Assert
        Assertions.assertThrows(NullPointerException.class, () -> new SketchBoard().setCommand(null));
    }

}
