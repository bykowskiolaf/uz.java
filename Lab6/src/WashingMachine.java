import Components.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import statuses.Status;

@Getter
@Setter
@RequiredArgsConstructor
public class WashingMachine {

    private WaterPump waterPump;
    private Status status;
    private Motor motor;
    private HeatingElement heatingElement;
    private Drum drum;
    private DetergentContainer detergentContainer;

    public WashingMachine(int maxFlow, int maxRrm, int maxTemp, int maxClothesCapacity, int maxDetergentCapacity) {
        this.waterPump = new WaterPump(maxFlow);
        this.status = Status.OFF;
        this.motor = new Motor(maxRrm);
        this.heatingElement = new HeatingElement(maxTemp);
        this.drum = new Drum(maxClothesCapacity);
        this.detergentContainer = new DetergentContainer(maxDetergentCapacity);
    }

    public void turnOn() {
        this.status = Status.ON;
    }

    public void turnOff() {
        this.status = Status.OFF;
    }

    
}
