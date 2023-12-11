package Components;

import lombok.Data;

@Data
public class DetergentContainer {

    private int maxCapacity;
    private int detergentAmount;

    public DetergentContainer(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.detergentAmount = 0;
    }

    public void setDetergent(int detergent) {
        this.detergentAmount = Math.min(detergent, this.maxCapacity);
    }
}
