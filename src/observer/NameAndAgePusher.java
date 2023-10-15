package observer;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 12:08
 * @Description: 姓名与年龄信息推送者
 */
public class NameAndAgePusher implements Pusher{
    @Override
    public void publish(String topic, String msg) {
        Broker.publishMsg(topic,msg,this);
    }
}
