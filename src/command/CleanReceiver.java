package command;

/** 清扫机器人
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:17
 * @Description:
 */
public class CleanReceiver implements Receiver{
    public void cleanTable() {
        System.out.println("开始清洁桌子..");
        System.out.println("清洁桌子完毕");
    }

    public void cleanFloor() {
        System.out.println("开始清洁地板...");
        System.out.println("清洁地板完毕");
    }
}
