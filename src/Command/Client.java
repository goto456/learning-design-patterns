package Command;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();

        Command lightOnCommand = new LightOffCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        invoker.setOnCommand(lightOnCommand, 0);
        invoker.setOffCommands(lightOffCommand, 0);

        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);

    }
}
