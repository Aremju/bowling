package frames;

import java.util.List;

/**
 * This class represents a normal frame.
 * in a normal frame the amount of points cannot
 * be 10. It must be in between 0 and 9.
 */
public class Normal extends Frame{
    /**
     * Creates a normal frame
     *
     * @param throwings current thrown pins by player
     * @param firstThrow the first throw of this frame
     * @param secondThrow the second throw of this frame
     */
    public Normal(List<Integer> throwings, int firstThrow, int secondThrow) {
        super(throwings);
        getThrowings().add(firstThrow);
        getThrowings().add(secondThrow);
    }

    @Override
    public int getScoreOfFrame() {
        return getThrowings().get(getStartIdx()) + getThrowings().get(getStartIdx()+1);
    }

    @Override
    public int getFrameSize() {
        return 2;
    }
}
