public class LightSwitch {
    private Switchable switchable;

    public LightSwitch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void flip() {
        if (switchable.isOn()) {
            switchable.turnOff();
        } else {
            switchable.turnOn();
        }
    }
}