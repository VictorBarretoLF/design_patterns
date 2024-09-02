import com.victorbarreto.DrawRectangleConcreteCommand;
import com.victorbarreto.DrawShape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

class DrawRectangleConcreteCommandTest {
    /**
     * Method under test: {@link DrawRectangleConcreteCommand#execute()}
     */
    @Test
    void executeCallsDrawRectangle() {
        // Arrange
        DrawShape drawShape = BDDMockito.mock(DrawShape.class);
        DrawRectangleConcreteCommand drawRectangleConcreteCommand =
                new DrawRectangleConcreteCommand(drawShape);

        // Act
        drawRectangleConcreteCommand.execute();

        // Assert
        BDDMockito.verify(drawShape).drawRectangle();
    }

    @Test
    void newDrawRectangleConcreteCommandWithNullDrawShapeThrowsException() {
        // Arrange, Act and Assert
        Assertions.assertThrows(NullPointerException.class, () -> new DrawRectangleConcreteCommand(null));
    }

}
