package frames;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class represents the Bonus Test which only tests
 * Bonus Frames for their specific behaviour
 */
public class BonusTest extends FrameTest {

    @ParameterizedTest
    @CsvSource({
            "10,X,11",
            "9,9,11",
            "8,8,11",
            "7,7,11",
            "6,6,12",
            "5,5,12",
            "4,4,12",
            "3,3,12",
            "2,2,12",
            "1,1,12",
            "0,-,11"
    })
    void dummy(int result,String frameString, int frameNumber) {
        Frame currentFrame = FrameFactory.getSpecificFrame(frameString,throwings,frameNumber);
        assertTrue(currentFrame instanceof Bonus);
        assertEquals(result,throwings.get(throwings.size()-1));
    }
}
