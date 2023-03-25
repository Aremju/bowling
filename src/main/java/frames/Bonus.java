package frames;

import java.util.List;

/**
 * This class represents a bonus throw and it can
 * be only created if the player has thrown a strike
 * or spare at the 10th Frame.
 */
public class Bonus extends Frame{
    /**
     * Creates a Frame-instance
     *
     * @param throwings currently thrown pins by player
     * @param score the score that was made by bonus throw
     */
    public Bonus(List<Integer> throwings, int score) {
        super(throwings);
        getThrowings().add(score);
    }

    @Override
    public int getScoreOfFrame() {
        return 0;
    }

    @Override
    public int getFrameSize() {
        return 1;
    }
}
