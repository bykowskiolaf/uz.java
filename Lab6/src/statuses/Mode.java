package statuses;

public enum Mode {

    COTTON(100, 1000, 90, 10, 10),
    SYNTHETIC(50, 800, 60, 5, 5),
    MIXED(75, 900, 70, 7, 7),
    WOOL(25, 600, 40, 3, 3);

    public final int maxFlow;
    public final int maxRpm;
    public final int maxTemp;
    public final int maxClothesCapacity;
    public final int maxDetergentCapacity;

    Mode(int maxFlow, int maxRrm, int maxTemp, int maxClothesCapacity, int maxDetergentCapacity) {
        this.maxFlow = maxFlow;
        this.maxRpm = maxRrm;
        this.maxTemp = maxTemp;
        this.maxClothesCapacity = maxClothesCapacity;
        this.maxDetergentCapacity = maxDetergentCapacity;
    }
}
