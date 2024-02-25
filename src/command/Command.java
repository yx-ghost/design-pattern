package command;

/** 命令接口
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:11
 * @Description:
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();
    /**
     * 撤销命令
     */
    void undo();
}
