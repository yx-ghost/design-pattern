package command;

/** 命令模式主类
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:11
 * @Description:
 */
public class CommandMain {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        CleanFloorCommand command = new CleanFloorCommand(new CleanReceiver());
        CleanTableCommand cleanTableCommand = new CleanTableCommand(new CleanReceiver());
        CookCommand cookCommand = new CookCommand(new CookReceiver());

        invoker.addCommand(command);
        invoker.addCommand(cleanTableCommand);
        invoker.addCommand(cookCommand);

        invoker.executeAllCommand();
    }
}
