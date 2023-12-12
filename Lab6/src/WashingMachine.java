import Components.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import statuses.Mode;
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
    private Mode currentMode;

    public WashingMachine(int maxFlow, int maxRrm, int maxTemp, int maxClothesCapacity, int maxDetergentCapacity) {
        this.waterPump = new WaterPump(maxFlow);
        this.status = Status.OFF;
        this.motor = new Motor(maxRrm);
        this.heatingElement = new HeatingElement(maxTemp);
        this.drum = new Drum(maxClothesCapacity);
        this.detergentContainer = new DetergentContainer(maxDetergentCapacity);
    }

    private void handleModeChange(Mode newMode) {
        this.waterPump.setModeFlow(newMode.maxFlow);
        this.motor.setModeRpm(newMode.maxRpm);
        this.heatingElement.setModeTemperature(newMode.maxTemp);
        this.currentMode = newMode;
    }

    public void turnOn() {
        this.status = Status.ON;
        this.waterPump.turnOn();
        this.motor.turnOn();
        this.heatingElement.turnOn();
    }

    public void turnOff() {
        this.status = Status.OFF;
        this.waterPump.turnOff();
        this.motor.turnOff();
        this.heatingElement.turnOff();
    }

    public void setMode(Mode newMode) {
        this.handleModeChange(newMode);
    }

    public void setTemperature(int temperature) {
        this.heatingElement.setTemperature(temperature);
    }

    public void setRpm(int rpm) {
        this.motor.setRpm(rpm);
    }

    public void setFlow(int flow) {
        this.waterPump.setFlow(flow);
    }

    public void addClothes() {
        this.drum.fill();
    }

    public void removeClothes() {
        this.drum.empty();
    }

    public void addDetergent() {
        this.detergentContainer.fill();
    }

    public void startCycle() {
        this.waterPump.setFlow(this.currentMode.maxFlow);
        this.motor.setRpm(this.currentMode.maxRpm);
        this.heatingElement.setTemperature(this.currentMode.maxTemp);
        this.detergentContainer.empty();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.waterPump.setFlow(0);
        this.motor.setRpm(0);
        this.heatingElement.setTemperature(0);
    }

    public void getMachineDetails() {
        System.out.println("Washing machine details:");
        System.out.println(STR."Status: \{this.status}");
        System.out.println(STR."Current mode: \{this.currentMode}");
        System.out.println(STR."Water pump: \{this.waterPump}");
        System.out.println(STR."Motor: \{this.motor}");
        System.out.println(STR."Heating element: \{this.heatingElement}");
        System.out.println(STR."Drum: \{this.drum}");
        System.out.println(STR."Detergent container: \{this.detergentContainer}");
    }
}
