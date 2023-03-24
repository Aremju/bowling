import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
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
    @ValueSource(strings = {"X X X X X X X X X X X X"})
    void testOnlyStrikes(String current){
        assertEquals(300,bowlingGame.getScore(current));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "9/ 8/ 8/ 9/ 8/ 8/ 9/ 8/ 8/ ",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    })
    void testOnlySpares(String current) {

    }
}
