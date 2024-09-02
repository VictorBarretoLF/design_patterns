import com.victorbarreto.DrawShape;
import com.victorbarreto.DrawSquareConcreteCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

class DrawSquareConcreteCommandTest {

    @Test
    void executeCallsDrawSquare() {
        // Arrange
        DrawShape drawShape = BDDMockito.mock(DrawShape.class);
        DrawSquareConcreteCommand drawSquareConcreteCommand =
                new DrawSquareConcreteCommand(drawShape);

        // Act
        drawSquareConcreteCommand.execute();

        // Assert
        BDDMockito.verify(drawShape).drawSquare();
    }

    @Test
    void newDrawSquareConcreteCommandWithNullDrawShapeThrowsException() {
        // Arrange, Act and Assert
        Assertions.assertThrows(NullPointerException.class, () -> new DrawSquareConcreteCommand(null));
    }

}
