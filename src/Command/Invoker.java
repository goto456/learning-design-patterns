package Command;

/**
 * 遥控器
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private static final int SLOT_NUM = 7;

    public Invoker() {
        this.onCommands = new Command[SLOT_NUM];
        this.offCommands = new Command[SLOT_NUM];
    }

    public void setOnCommand(Command command, int slot) {
        onCommands[slot] = command;
    }

    public void setOffCommands(Command command, int slot) {
        offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
