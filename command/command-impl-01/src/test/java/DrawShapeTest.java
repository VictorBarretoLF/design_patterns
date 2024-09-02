import com.victorbarreto.DrawShape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DrawShapeTest {
    /**
     * Method under test: {@link DrawShape#drawCircle()}
     */
    @Test
    void drawCirclePrintsCorrectMessage() {
        // Arrange
        DrawShape drawShape = new DrawShape();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        drawShape.drawCircle();

        // Assert
        Assertions.assertEquals("Drawing a circle\n", outContent.toString());
    }

    /**
     * Method under test: {@link DrawShape#drawSquare()}
     */
    @Test
    void drawSquarePrintsCorrectMessage() {
        // Arrange
        DrawShape drawShape = new DrawShape();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        drawShape.drawSquare();

        // Assert
        Assertions.assertEquals("Drawing a square\n", outContent.toString());
    }

    /**
     * Method under test: {@link DrawShape#drawRectangle()}
     */
    @Test
    void drawRectanglePrintsCorrectMessage() {
        // Arrange
        DrawShape drawShape = new DrawShape();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        drawShape.drawRectangle();

        // Assert
        Assertions.assertEquals("Drawing a rectangle\n", outContent.toString());
    }

    /**
     * Method under test: {@link DrawShape#eraseShape()}
     */
    @Test
    void eraseShapePrintsCorrectMessage() {
        // Arrange
        DrawShape drawShape = new DrawShape();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        drawShape.eraseShape();

        // Assert
        Assertions.assertEquals("Erasing a shape\n", outContent.toString());
    }

}
