public abstract class Frame {
    private int pointsOfFrame;

    public Frame(int pointsOfFrame) {
        this.pointsOfFrame = pointsOfFrame;
    }

    public int getPointsOfFrame() {
        return this.pointsOfFrame;
    }

    public int setPointsOfFrame(int newPoints) {
        this.pointsOfFrame = newPoints;
    }
}
