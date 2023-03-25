import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class represents our main test class
 * which provides several test cases for the
 * bowling kata.
 */
public class BowlingGameTest {
    //Bowling instance for each test case
    private BowlingGame bowlingGame;

    /**
     * Sets up a new BowlingGame instance
     * for each test case
     */
    @BeforeEach
    void setUp() {
        this.bowlingGame = new BowlingGame();
    }

    /**
     * Deletes the BowlingGame instance after
     * each test
     */
    @AfterEach
    void tearDown() {
        this.bowlingGame = null;
    }

    /**
     * Tests the bowling program
     *
     * @param result the expected result
     * @param currentFrameString the Frame-String provided by user
     */
    @ParameterizedTest
    @CsvSource({
            "300,X X X X X X X X X X X X",
            "90,9- 9- 9- 9- 9- 9- 9- 9- 9- 9-"
    })
    void testBowling(int result, String currentFrameString){
        assertEquals(result,bowlingGame.getScore(currentFrameString));
    }
}
