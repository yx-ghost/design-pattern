package command;

/** 清洁地板命令
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:21
 * @Description:
 */
public class CleanFloorCommand implements Command{
    private final CleanReceiver cleanReceiver;

    public CleanFloorCommand(CleanReceiver cleanReceiver) {
        this.cleanReceiver = cleanReceiver;
    }

    @Override
    public void execute() {
        cleanReceiver.cleanFloor();
    }

    @Override
    public void undo() {
        System.out.println("暂不能撤销");
    }
}
