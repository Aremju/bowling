package frames;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class represents the test class for the FrameFactory
 */
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
        assertTrue(FrameFactory.getSpecificFrame(frameString,new ArrayList<>(),1) instanceof Spare);
    }

    /**
     * Tests if the FrameFactory creates a Strike instance out of an
     * X.
     */
    @Test
    void testForStrike() {
        assertTrue(FrameFactory.getSpecificFrame("X",new ArrayList<>(),1) instanceof Strike);
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
        assertTrue(FrameFactory.getSpecificFrame(frameString,new ArrayList<>(),1) instanceof Normal);
    }
}
