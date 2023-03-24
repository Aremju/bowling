package frames;

import java.util.List;

public class FrameFactory {
    public static Frame getSpecificFrame(String scoreBoardString, List<Integer> currentThrows) {
        Frame erg = null;
        if(scoreBoardString.length() == 2 && scoreBoardString.endsWith("/")) { // Spare
            erg = new Spare(0);
        } else if (scoreBoardString.equals("X")) { // Strike
            erg = new Strike(0);
        } else {
            erg = new Normal(0);
        }
        return erg;
    }
}
