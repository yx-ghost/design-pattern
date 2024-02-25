package command;

/** 煮饭机器人
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:16
 * @Description:
 */
public class CookReceiver implements Receiver{
    public void cook() {
        System.out.println("开始煮饭...");
        System.out.println("煮饭结束了...");
    }
}
