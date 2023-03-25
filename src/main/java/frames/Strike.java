package frames;

import java.util.List;

/**
 * This class represents a Strike-instance which is
 * in points 10 + firstNextThrow + secondNextThrow
 */
public class Strike extends Frame {

    /**
     * creates a Strike-instance and adds 10 to our throwings
     * @param throwings the current throwing of the player
     */
    public Strike(List<Integer> throwings) {
        super(throwings);
        getThrowings().add(10);
    }

    @Override
    public int getScoreOfFrame() {
        return 10 + getNextFirstThrow() + getNextSecondThrow();
    }

    @Override
    public int getFrameSize() {
        return 1;
    }
}
