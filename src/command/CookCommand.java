package command;

/** 煮饭命令
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:19
 * @Description:
 */
public class CookCommand implements Command{
    private final CookReceiver cookReceiver;

    public CookCommand(CookReceiver cookReceiver) {
        this.cookReceiver = cookReceiver;
    }

    @Override
    public void execute() {
        cookReceiver.cook();
    }

    @Override
    public void undo() {
        System.out.println("不能撤销");
    }
}
