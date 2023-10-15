package observer;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 12:07
 * @Description: 姓名观察者
 */
public class NameObserver implements Observer {
    @Override
    public void getMsg(String msg) {
        System.out.println("我收到了姓名有关的消息："+msg);
    }

    @Override
    public void observe(String topic) {
        Broker.observe(topic,this);
    }
}
