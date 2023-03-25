package frames;

import java.util.List;

public class Strike extends Frame {

    public Strike(List<Integer> throwings) {
        super(throwings);
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
