package by.it.sinkevich.jd01_08;

/**
 * @author Sinkevich Denis
 */
abstract class Player implements IElectronic {

    private String name;
    private boolean isTurnedOn;
    private boolean isPaused;
    private boolean isBroken;

    Player() {
        isTurnedOn = false;
        isPaused = true;
        isBroken = false;
    }

    Player(String name) {
        this();
        this.name = name;
    }

    @Override
    public void turnOn() {
        if (isTurnedOn) return;
        isTurnedOn = true;
        System.out.println("Player is on!");
    }

    @Override
    public void turnOff() {
        if (!isTurnedOn) return;
        isPaused = true;
        isTurnedOn = false;
        System.out.println("Player is off!");
    }

    @Override
    public void play() {
        if (isTurnedOn) {
            isPaused = false;
            System.out.println("Player is playing!");
        } else {
            System.out.println("Player is off!");
        }
    }

    @Override
    public void pause() {
        if (isTurnedOn) {
            isPaused = true;
            System.out.println("Player is paused!");
        } else {
            System.out.println("Player is off!");
        }
    }

    @Override
    public boolean repair() {
        if (!isBroken) {
            System.out.println("Player is not broken!");
            return false;
        } else {
            turnOff();
            isBroken = false;
            System.out.println("Player is repaired!");
        }
        return true;
    }

    boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBroken() {
        return isBroken;
    }

    void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}