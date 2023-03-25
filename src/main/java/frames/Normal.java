package frames;

import java.util.List;

public class Normal extends Frame{

    public Normal(List<Integer> throwings) {
        super(throwings);
    }

    @Override
    public int getScoreOfFrame() {
        return 0;
    }

    @Override
    public int getFrameSize() {
        return 2;
    }
}
