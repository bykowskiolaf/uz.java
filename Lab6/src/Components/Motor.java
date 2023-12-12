package Components;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Motor {

    private int maxRpm;
    private int maxModeRpm;
    private int currentRpm;
    private boolean isOn;

    public Motor(int maxRpm) {
        this.maxRpm = maxRpm;
        this.maxModeRpm = 0;
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

    public void setModeRpm(int rpm) {
        this.maxModeRpm = Math.min(rpm, this.maxRpm);
    }
}
