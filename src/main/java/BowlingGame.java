import frames.Frame;
import frames.FrameFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the BowlingGame.
 * instances of this class are able to calculate
 * a bowling score out of a score board.
 */
public class BowlingGame {
    //holds all the frames in this list
    private List<Frame> frames;
    //holds all throwings of pins as intever values
    private List<Integer> throwings;
    public BowlingGame() {
        this.frames = new ArrayList<>();
        this.throwings = new ArrayList<>();
    }

    /**
     * Calculates the sum of all frames and returns it
     * @param scoreBoard the ScoreBoard of the Bowling-table
     *
     * @return the actual points of this bowling-table
     */
    public int getScore(String scoreBoard) {
        String [] splittedScoreBoard = scoreBoard.split(" ");
        //calculate the first 9 frames (no bonus frame)
        for(int i = 0; i < 9; i++) {
            addFrame(splittedScoreBoard[i], i+1);
        }
        //calculate the bonus frames
        String lastFrame = splittedScoreBoard[9];
        for(int i = 0; i < lastFrame.length(); i++) {
            addFrame(lastFrame.substring(i,i+1), 10);
        }
        return frames.stream().mapToInt(Frame::getScoreOfFrame).sum();
    }

    /**
     * adds a frame from the FrameFactory to our frame-list
     *
     * @param scoreBoardString the current part of the scoreboard that needs to be evaluated
     * @param frameNumber the Frame that is conquered
     */
    public void addFrame(String scoreBoardString, int frameNumber) {
        frames.add(FrameFactory.getSpecificFrame(scoreBoardString,throwings, frameNumber));
    }
}
