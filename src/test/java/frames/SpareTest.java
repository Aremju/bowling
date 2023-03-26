package frames;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class represents a Spare Test
 * which is there to test Spares on all parameters
 * possible
 */
public class SpareTest extends FrameTest {
    /**
     * Tests the Spare-Object on the right behaviour
     *
     * @param result the expected Result of the Spare-Frame
     * @param spareFrameString the FrameString that provides a spare
     * @param nextFrameString the Frame after the spare
     * @param frameNumber the given Frame Number (1-9)
     */
    @ParameterizedTest
    @CsvSource({
            "20,-/,X,1",
            "19,1/,9-,2",
            "11,2/,1/,3",
            "10,3/,-5,4",
            "14,4/,4-,5",
            "13,5/,33,6",
            "16,6/,62,7",
            "14,7/,43,8",
            "12,8/,25,9",
            "15,9/,52,1"
    })
    void testForSpare(int result,String spareFrameString,String nextFrameString,int frameNumber) {
        Frame spareFrame = FrameFactory.getSpecificFrame(spareFrameString,throwings,frameNumber);
        Frame nextFrame = FrameFactory.getSpecificFrame(nextFrameString,throwings,frameNumber+1);
        assertTrue(spareFrame instanceof Spare);
        assertEquals(result,spareFrame.getScoreOfFrame());
    }
}
