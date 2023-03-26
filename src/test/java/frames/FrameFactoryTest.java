package frames;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
    @CsvSource( {"-/,1","1/,2","2/,3","3/,4","4/,5","5/,6","6/,7","7/,8","8/,9","9/,10"})
    void testForSpare(String frameString, int frameNumber) {
        assertTrue(FrameFactory.getSpecificFrame(frameString,new ArrayList<>(),1) instanceof Spare);
    }

    /**
     * Tests if the FrameFactory creates a Strike instance out of an
     * X.
     */
    @ParameterizedTest
    @CsvSource({
            "X,1", "X,2", "X,3", "X,4", "X,5", "X,6", "X,7", "X,8", "X,9", "X,10"
    })
    void testForStrike(String frameString, int frameNumber) {
        assertTrue(FrameFactory.getSpecificFrame(frameString,new ArrayList<>(),frameNumber) instanceof Strike);
    }

    /**
     * Tests if the FrameFactory creates instances of Normal-Type with the
     * following parameters
     *
     * @param frameString a String which is supposed to work as a Normal-Frame
     */
    @ParameterizedTest
    @CsvSource({"12,1", "34,2", "1-,3", "45,4", "45,5", "12,6", "42,7", "45,8", "22,9", "45,10", "12,10", "43,10", "--,1"})
    void testforNormal(String frameString, int frameNumber) {
        assertTrue(FrameFactory.getSpecificFrame(frameString,new ArrayList<>(),frameNumber) instanceof Normal);
    }


}
