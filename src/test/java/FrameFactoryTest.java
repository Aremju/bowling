import frames.FrameFactory;
import frames.Normal;
import frames.Spare;
import frames.Strike;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrameFactoryTest {
    /**
     * Tests if the FrameFactory creates a Spare-Instance out of a
     * Spare-String
     *
     * @param frameString a String which is supposed to be a Spare
     */
    @ParameterizedTest
    @ValueSource(strings = {"-/","1/","2/","3/","4/","5/","6/","7/","8/","9/"})
    void testForSpare(String frameString) {
        assertTrue(FrameFactory.getSpecificFrame(frameString,null) instanceof Spare);
    }

    /**
     * Tests if the FrameFactory creates an Strike instance out of an
     * X.
     */
    @Test
    void testForStrike() {
        assertTrue(FrameFactory.getSpecificFrame("X",null) instanceof Strike);
    }

    /**
     * Tests if the FrameFactory creates instances of Normal-Type with the
     * following parameters
     *
     * @param frameString a String which is supposed to work as a Normal-Frame
     */
    @ParameterizedTest
    @ValueSource(strings = {"12", "34", "1-", "45", "45", "12", "42", "45", "22", "45", "12", "43", "--"})
    void testforNormal(String frameString) {
        assertTrue(FrameFactory.getSpecificFrame(frameString,null) instanceof Normal);
    }
}
