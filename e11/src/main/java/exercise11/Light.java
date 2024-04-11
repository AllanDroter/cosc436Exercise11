package exercise11;

public class Light {

    private boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    // made cuz there's no output we can witness and that's annoying
    public boolean isOn() {
        return on;
    }
}