package frames;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class represents a FrameTest,
 * extending classes have access to the setUp
 * and tearDown of the given ArrayList provided by this class
 */
public abstract class FrameTest {
    protected List<Integer> throwings;
    private final Random random = new Random();

    /**
     * Sets up a List for all Frame-Tests
     */
    @BeforeEach
    void setUp() {
        this.throwings = new ArrayList<>();
        this.throwings.add(random.nextInt(9));
        this.throwings.add(random.nextInt(9));
    }

    /**
     * Deletes the list for all test cases of subclasses
     */
    @AfterEach
    void tearDown() {
        this.throwings = null;
    }
}
