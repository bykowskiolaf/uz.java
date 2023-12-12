package Components;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Drum {

    private int maxCapacity;
    private int currentLoad;

    public Drum(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentLoad = 0;
    }

    public void setLoad(int load) {
        this.currentLoad = Math.min(load, this.maxCapacity);
    }

    public void addLoad(int load) {
        this.currentLoad = Math.min(this.currentLoad + load, this.maxCapacity);
    }

    public void empty() {
        this.currentLoad = 0;
    }

    public void fill() {
        this.currentLoad = this.maxCapacity;
    }
}
