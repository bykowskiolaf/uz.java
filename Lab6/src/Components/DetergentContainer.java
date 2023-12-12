package Components;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
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

    public void fill() {
        this.detergentAmount = this.maxCapacity;
    }

    public void empty() {
        this.detergentAmount = 0;
    }
}
