import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
            "300,X X X X X X X X X XXX",
            "90,9- 9- 9- 9- 9- 9- 9- 9- 9- 9-",
            "278,X X X X X X X X X 8/X",
            "150,5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5",
            "149,3/ 7- 9- 8- 9/ X X 9/ 7- 9/5",
            "165,3/ X X -- 9- 7- 8/ 9/ X XXX",
            "45,9- 8- 7- 6- 5- 4- 3- 2- 1- --",
            "94,36 9/ 3/ 7- 9- 3- 4/ 42 43 27",
            "98,X X X -- -- 32 21 16 71 8/5",
            "200,X 9/ X 9/ X 9/ X 9/ X 9/X",
            "104,9/ -- 7/ 81 72 9/ 7/ 63 35 71",
            "138,9- 9- 9/ 7/ 8/ 5/ 4/ 3/ 2/ 1/X",
            "215,8/ 7/ 6/ 5/ 4/ 3/ X X X XXX",
            "147,7/ 6/ 5/ 43 7/ 5/ X X 9/ 8/X",
            "157,8/ 9/ 81 9/ 8/ X X 72 81 63",
            "156,8/ 9/ 1/ 7/ 6/ 5/ 4/ 3/ 2/ 9/X",
            "123,3/ 33 54 42 26 3/ 61 27 X X9/",
            "134,4/ 52 9/ 53 45 6/ 6/ X 7/ 54",
            "106,35 9/ 43 41 41 53 25 32 7/ XX7",
            "128,X 63 16 8/ 5/ 36 8/ 14 6/ X6/",
            "131,X 9/ 54 6/ 9/ 8/ 45 72 54 63",
            "113,X X X -- 54 52 34 5/ 36 35",
            "115,36 41 6/ X 7/ 1- 26 X 62 4/5",
            "123,5/ 27 8/ X X 7- -6 35 8/ 23",
            "202,X X X X X X 6/ 22 -- 2/X",
            "169,X 8/ 5/ 4/ 8/ 34 5/ 36 X XXX",
            "169,X 53 5/ 4/ X 8/ X X 2/ 81",
            "0,-- -- -- -- -- -- -- -- -- --",
            "1,1- -- -- -- -- -- -- -- -- --",
            "129,5/ 33 44 5/ 6/ 9/ X 5/ 34 52",
            "108,9/ 5/ 45 -2 34 26 8/ 62 54 8/X",
            "127,5/ X X 7/ 24 27 62 53 7/ 15",
            "167,X X 9/ X X 62 6- -3 52 XXX",
            "170,X 5/ 5/ X 61 63 X 8/ X X36",
            "179,9/ X X 63 62 X X X 63 6/3",
            "221,X X X X X X 81 54 6/ 6/X",
            "177,X 27 6/ X X X 61 54 3/ X8/",
            "224,4/ 9/ X X X 72 X 7/ X XXX",
            "179,9/ 35 4/ 6/ X X X 62 6/ X8/",
            "103,45 35 25 8/ 8/ X 41 31 35 45",
            "192,X 3/ 4/ 6/ 62 9/ X X 8/ XXX",
            "138,X 8/ 34 5/ 43 54 6/ 2/ 8/ X53",
            "213,9/ 81 X X X X 42 4/ X XXX",
            "126,X 7/ 6/ 81 7/ 5- -- 5/ 45 7/X",
            "90,X 54 25 36 45 34 53 24 53 53",
            "138,9/ 54 6/ 6/ 72 9/ 63 5/ 4/ 3/X",
            "187,9/ 5/ 4/ X X X X 32 7/ 5/X",
            "136,9/ X X X 53 13 52 4- -- 3/X",
            "196,8/ 8/ X X X X X 51 63 9/2",
            "134,7/ 45 7/ 8/ 6/ 26 8/ X 36 36"
    })
    void testBowling(int result, String currentFrameString){
        assertEquals(result,bowlingGame.getScore(currentFrameString));
    }
}
