package Components;

import lombok.Data;

@Data
public class HeatingElement {

    private int maxTemperature;
    private int currentTemperature;
    private boolean isOn;

    public HeatingElement(int maxTemperature) {
        this.maxTemperature = maxTemperature;
        this.currentTemperature = 0;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setTemperature(int temperature) {
        this.currentTemperature = Math.min(temperature, this.maxTemperature);
    }

}
