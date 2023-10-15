package observer;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 12:06
 * @Description: 年龄观察者
 */
public class AgeObserver implements Observer{
    @Override
    public void getMsg(String msg) {
        System.out.println("我收到与年龄有关的消息，为："+msg);
    }

    @Override
    public void observe(String topic) {
        Broker.observe(topic,this);
    }
}
