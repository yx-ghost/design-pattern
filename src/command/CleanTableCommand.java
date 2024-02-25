package command;

/** 打扫桌子命令
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:20
 * @Description:
 */
public class CleanTableCommand implements Command{
    private final CleanReceiver cleanReceiver;

    public CleanTableCommand(CleanReceiver cleanReceiver) {
        this.cleanReceiver = cleanReceiver;
    }

    @Override
    public void execute() {
        cleanReceiver.cleanTable();
    }

    @Override
    public void undo() {
        System.out.println("暂不能撤销");
    }
}
