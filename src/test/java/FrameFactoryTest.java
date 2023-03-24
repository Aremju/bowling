import frames.FrameFactory;
import frames.Spare;
import frames.Strike;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrameFactoryTest {
    @ParameterizedTest
    @ValueSource(strings = {"-/","1/","2/","3/","4/","5/","6/","7/","8/","9/"})
    void testForSpare(String frameString) {
        assertTrue(FrameFactory.getSpecificFrame(frameString) instanceof Spare);
    }

    @Test
    void testForStrike() {
        assertTrue(FrameFactory.getSpecificFrame("X") instanceof Strike);
    }


}
