package Components;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WaterPump {

    private int maxPumpFlow;
    private int maxModeFlow;
    private int currentFlow;
    private boolean isOn;

    public WaterPump(int maxFlow) {
        this.maxPumpFlow = maxFlow;
        this.maxModeFlow = 0;
        this.currentFlow = 0;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setFlow(int flow) {
        this.currentFlow = Math.min(flow, this.maxPumpFlow);
    }

    public void setModeFlow(int flow) {
        this.maxModeFlow = Math.min(flow, this.maxPumpFlow);
    }

}
