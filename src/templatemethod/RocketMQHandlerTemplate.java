package templatemethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:15
 * @Description: rocketMQ模板方法模式
 */
public abstract class RocketMQHandlerTemplate {
    public abstract void before();

    public abstract void after();

    public final void onMessage() {
        before();
        try {
            System.out.println("我接收到消息了");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        after();
    }
}
