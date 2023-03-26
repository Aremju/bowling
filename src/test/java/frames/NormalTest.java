package frames;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class represents a Test which only Tests
 * Objects of normal Frames, points from 0 to 10 (10 exclusive)
 */
public class NormalTest extends FrameTest{
    /**
     * Tests if Normal Frames work correctly
     *
     * @param result the expected result of a normal frame
     * @param frameString the given String (supposed to be Normal Frame)
     * @param frameNumber the current Frame Number
     */
    @ParameterizedTest
    @CsvSource({
            "0,--,1",
            "9,18,2",
            "7,7-,3",
            "0,--,4",
            "7,34,5",
            "9,45,6",
            "6,33,7",
            "5,14,8",
            "5,23,9",
            "3,62,10",
    })
    void testNormalFrame(int result, String frameString, int frameNumber) {
        Frame currentFrame = FrameFactory.getSpecificFrame(frameString,throwings,frameNumber);
        assertTrue(currentFrame instanceof Normal);
        assertEquals(result,currentFrame.getScoreOfFrame());
    }
}
