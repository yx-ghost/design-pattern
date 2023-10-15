package observer;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:53
 * @Description: 观察者接口，实现了这个接口的就是观察者
 */
public interface Observer {
    void getMsg(String msg);

    void observe(String topic);
}
