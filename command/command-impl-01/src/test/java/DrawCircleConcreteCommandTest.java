import com.victorbarreto.DrawCircleConcreteCommand;
import com.victorbarreto.DrawShape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

class DrawCircleConcreteCommandTest {
    /**
     * Method under test: {@link DrawCircleConcreteCommand#execute()}
     */
    @Test
    void executeCallsDrawCircle() {
        // Arrange
        DrawShape drawShape = BDDMockito.mock(DrawShape.class);
        DrawCircleConcreteCommand drawCircleConcreteCommand =
                new DrawCircleConcreteCommand(drawShape);

        // Act
        drawCircleConcreteCommand.execute();

        // Assert
        BDDMockito.verify(drawShape).drawCircle();
    }

    @Test
    void newDrawCircleConcreteCommandWithNullDrawShapeThrowsException() {
        // Arrange, Act and Assert
        Assertions.assertThrows(NullPointerException.class, () -> new DrawCircleConcreteCommand(null));
    }

}
