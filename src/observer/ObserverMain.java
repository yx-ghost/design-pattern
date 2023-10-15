package observer;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:52
 * @Description: 观察者模式主类
 */
public class ObserverMain {
    public static void main(String[] args) {
        Observer nameObserver = new NameObserver();
        nameObserver.observe("name");
        Observer ageObserver = new AgeObserver();
        ageObserver.observe("age");
        Pusher pusher = new NameAndAgePusher();
        pusher.publish("name","夏无双");
        pusher.publish("age","23");
    }
}
