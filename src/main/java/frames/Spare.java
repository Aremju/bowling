package frames;

import java.util.List;

/**
 * This class represents a Spare which is 10 points
 * plus the next first throw of pins
 */
public class Spare extends Frame{
    /**
     * creates a spare instance
     *
     * @param throwings currently thrown pins by the player
     * @param firstThrow first throw of this spare
     * @param secondThrow second throw of this spare
     */
    public Spare(List<Integer> throwings, int firstThrow, int secondThrow) {
        super(throwings);
        throwings.add(firstThrow);
        throwings.add(secondThrow);
    }

    @Override
    public int getScoreOfFrame() {
        return 10 + getNextFirstThrow();
    }

    @Override
    public int getFrameSize() {
        return 2;
    }
}
