package frames;

import java.util.List;

/**
 * This class represents a frame, it consists only
 * of the current thrown pins by the player and
 * also the startidx of the player's list
 */
public abstract class Frame {
    private final int startIdx;
    private final List<Integer> throwings;

    /**
     * Creates a Frame-instance
     *
     * @param throwings currently thrown pins by player
     */
    public Frame(List<Integer> throwings) {
        this.throwings = throwings;
        this.startIdx = this.throwings.size();
    }

    /**
     * @return the start idx of the player's list
     */
    protected int getStartIdx() {
        return this.startIdx;
    }

    /**
     * @return the list of thrown pins
     */
    public List<Integer> getThrowings() {
        return this.throwings;
    }

    /**
     * @return the score of this frame
     */
    public abstract int getScoreOfFrame();

    /**
     * @return the frame size (either 1 or 2)
     */
    public abstract int getFrameSize();

    /**
     * @return returns the next first throw after this frame
     */
    public int getNextFirstThrow() {
        return getThrowings().get(startIdx+getFrameSize());
    }

    /**
     * @return returns the next first throw after this frame
     */
    public int getNextSecondThrow() {
        return getThrowings().get(startIdx+getFrameSize()+1);
    }
}
