public class LightSwitch {
    private Light light = new Light();

    public void flip() {
        if (light.isOn()) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }
}