package observer;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:54
 * @Description: 消息推送者接口，即被观察者
 */
public interface Pusher {
    void publish(String topic,String msg);
}
