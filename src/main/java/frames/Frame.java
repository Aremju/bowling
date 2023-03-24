package frames;

import java.util.List;

public abstract class Frame {
    private int startIdx;
    private List<Integer> throwings;

    public Frame(List<Integer> throwings) {
        this.throwings = throwings;
        this.startIdx = this.throwings.size();
    }

    public List<Integer> getThrowings() {
        return this.throwings;
    }

    public abstract int getScoreOfFrame();
    public abstract int getFrameSize();

    public int getNextFirstThrow() {
        return 0;
    }

    public int getNextSecondThrow() {
        return 0;
    }
}
