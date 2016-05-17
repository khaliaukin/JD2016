package by.it.sinkevich.jd01_08;

/**
 * @author Sinkevich Denis
 */
interface IElectronic {

    void turnOn();
    void turnOff();
    void play();
    void pause();
    boolean connectToOtherDevice(IElectronic device);
    void connectToInternet();
    boolean repair();
}
