package Components;
import lombok.Data;

@Data
public class Motor {

    private int maxRpm;
    private int currentRpm;
    private boolean isOn;

    public Motor(int maxRpm) {
        this.maxRpm = maxRpm;
        this.currentRpm = 0;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setRpm(int rpm) {
        this.currentRpm = Math.min(rpm, this.maxRpm);
    }
}
