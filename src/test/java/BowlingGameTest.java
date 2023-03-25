import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    private BowlingGame bowlingGame;
    @BeforeEach
    void setUp() {
        this.bowlingGame = new BowlingGame();
    }

    @AfterEach
    void tearDown() {
        this.bowlingGame = null;
    }
    @ParameterizedTest
    @CsvSource({"0,X X X X X X X X X X X X"})
    void testOnlyStrikes(int result, String currentFrameString){
        assertEquals(result,bowlingGame.getScore(currentFrameString));
    }


}
