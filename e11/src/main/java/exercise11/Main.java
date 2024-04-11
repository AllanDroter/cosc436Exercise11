package exercise11;

public class Main {
    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();

        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // switch on
        control.setCommand(lightsOn);
        control.pressButton();
        // made cuz there's no output we can witness and that's annoying
        System.out.println(light.isOn());

        // switch off
        control.setCommand(lightsOff);
        control.pressButton();
        // made cuz there's no output we can witness and that's annoying
        System.out.println(light.isOn());
    }
}