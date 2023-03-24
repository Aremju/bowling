package frames;

import java.util.List;

public class Spare extends Frame{

    public Spare(List<Integer> throwings) {
        super(throwings);
    }

    @Override
    public int getScoreOfFrame() {
        return 0;
    }

    @Override
    public int getFrameSize() {
        return 0;
    }
}
