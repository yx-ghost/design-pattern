package command;

import java.util.ArrayList;
import java.util.List;

/** 命令调用者
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:13
 * @Description:
 */
public class Invoker {

    private final List<Command> cmdList = new ArrayList<>();

    /**
     * 执行命令
     * @param command 命令
     */
    public void executeCommand(Command command) {
        command.execute();
    }

    /**
     * 执行收到的所有命令
     */
    public void executeAllCommand() {
        for (Command command : cmdList) {
            command.execute();
        }
    }

    /**
     * 添加命令
     * @param command 命令
     */
    public void addCommand(Command command) {
        cmdList.add(command);
    }
}
