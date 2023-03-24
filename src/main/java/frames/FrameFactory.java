package frames;

import java.util.List;

public class FrameFactory {
    public static Frame getSpecificFrame(String scoreBoardString, List<Integer> currentThrows) {
        Frame erg = null;
        if(scoreBoardString.length() == 2 && scoreBoardString.endsWith("/")) { // Spare
            erg = new Spare(currentThrows);
        } else if (scoreBoardString.equals("X")) { // Strike
            erg = new Strike(currentThrows);
        } else {
            erg = new Normal(currentThrows);
        }
        return erg;
    }
}
