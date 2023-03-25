package frames;

import java.util.HashMap;
import java.util.List;

/**
 * This class represents the FrameFactory which creates
 * a Frame-Instance out of the given String-parameter
 */
public class FrameFactory {
    private static HashMap<String,Integer> getBowlingMap() {
        HashMap<String,Integer> bowlingMap = new HashMap<>();
        bowlingMap.put("-",0);
        bowlingMap.put("1",1);
        bowlingMap.put("2",2);
        bowlingMap.put("3",3);
        bowlingMap.put("4",4);
        bowlingMap.put("5",5);
        bowlingMap.put("6",6);
        bowlingMap.put("7",7);
        bowlingMap.put("8",8);
        bowlingMap.put("9",9);
        bowlingMap.put("X",10);
        return bowlingMap;
    }

    /**
     * Factory-Method which creates
     * a specific Frame-instance depending on the input scoreBoardString.
     *
     * Usage: if you have a bonus frame, assume that the length
     * of the string is 1, so you can use the HashMap to calculate
     * your result
     *
     * @param scoreBoardString the given Part of the scoreBoardString
     * @param currentThrows parameter for each Frame object needed
     * @param frameNumber the current Frame Number to determine bonus throws or not
     *
     * @return the specific frame instance
     */
    public static Frame getSpecificFrame(String scoreBoardString, List<Integer> currentThrows, int frameNumber) {
        HashMap<String,Integer> bowlingMap = getBowlingMap();
        Frame erg = null;
        if(frameNumber <= 10) {
            if(scoreBoardString.equals("X")) {
                erg = new Strike(currentThrows);
            } else if (scoreBoardString.endsWith("/")) {
                int firstThrow = bowlingMap.get("" + scoreBoardString.charAt(0));
                int secondThrow = 10 - firstThrow;
                erg = new Spare(currentThrows,firstThrow,secondThrow);
            } else {
                int firstThrow = bowlingMap.get("" + scoreBoardString.charAt(0));
                int secondThrow = bowlingMap.get("" + scoreBoardString.charAt(1));
                erg = new Normal(currentThrows,firstThrow,secondThrow);
            }
        } else {
            if(scoreBoardString.equals("/")) {
                erg = new Bonus(currentThrows,10 - currentThrows.get(currentThrows.size() -1));
            } else {
                erg = new Bonus(currentThrows,bowlingMap.get(scoreBoardString));
            }
        }
        return erg;
    }
}
