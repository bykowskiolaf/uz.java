package Components;

import lombok.Data;

@Data
public class WaterPump {

    private int maxFlow;
    private int currentFlow;
    private boolean isOn;

    public WaterPump(int maxFlow) {
        this.maxFlow = maxFlow;
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
        this.currentFlow = Math.min(flow, this.maxFlow);
    }

}
