import statuses.Mode;

public class test {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine(1000, 10, 10, 10, 10);

        washingMachine.turnOn();
        washingMachine.addClothes();
        washingMachine.addDetergent();
        washingMachine.setMode(Mode.COTTON);
        washingMachine.getMachineDetails();

        System.out.println("Washing machine cycle started...\n \n");
        washingMachine.startCycle();

        washingMachine.removeClothes();
        washingMachine.turnOff();
        washingMachine.getMachineDetails();
    }
}
