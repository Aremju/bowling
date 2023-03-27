package frames;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class represents a StrikeTest which is
 * there to test the Strike-instances on all
 * given parameters and behaviours
 */
public class StrikeTest extends FrameTest {
    @ParameterizedTest
    @CsvSource({
            "19,X,9-,2",
            "15,X,14,3",
            "18,X,35,4",
            "17,X,-7,5",
            "10,X,--,6",
            "14,X,22,7",
            "11,X,1-,8",
    })
    void testStrike(int result, String strikeFrameString, String nextFrameString,int frameNumber) {
        Frame strikeFrame = FrameFactory.getSpecificFrame(strikeFrameString,throwings,frameNumber);
        Frame afterStrikeFrame = FrameFactory.getSpecificFrame(nextFrameString,throwings,frameNumber+1);
        assertTrue(strikeFrame instanceof Strike);
        assertEquals(result,strikeFrame.getScoreOfFrame());
    }

    @Test
    void testStrikeDouble() {
        Frame firstStrikeFrame = FrameFactory.getSpecificFrame("X",throwings,1);
        Frame secondStrikeFrame = FrameFactory.getSpecificFrame("X",throwings,2);
        Frame randomFrame = FrameFactory.getSpecificFrame("--",throwings,3);
        assertEquals(20,firstStrikeFrame.getScoreOfFrame());
    }

    /**
     * Tests if a Turkey-Strike with 30 points is possible
     */
    @Test
    void testStrikeTurkey() {
        Frame firstStrikeFrame = FrameFactory.getSpecificFrame("X",throwings,1);
        Frame secondStrikeFrame = FrameFactory.getSpecificFrame("X",throwings,2);
        Frame thirdStrikeFrame = FrameFactory.getSpecificFrame("X",throwings,3);
        assertEquals(30,firstStrikeFrame.getScoreOfFrame());
    }
}
