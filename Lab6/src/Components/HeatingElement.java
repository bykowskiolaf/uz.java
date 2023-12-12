package Components;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class HeatingElement {

    private int maxTemperature;
    private int maxModeTemperature;
    private int currentTemperature;
    private boolean isOn;

    public HeatingElement(int maxTemperature) {
        this.maxTemperature = maxTemperature;
        this.maxModeTemperature = 0;
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

    public void setModeTemperature(int temperature) {
        this.maxModeTemperature = Math.min(temperature, this.maxTemperature);
    }

}
