package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:53
 * @Description: 消息队列
 */
public class Broker {
    private static final HashMap<String, List<Pusher>> pushMap = new HashMap<>();

    private static final HashMap<String, List<Observer>> observerMap = new HashMap<>();

    /**
     * 观察者订阅主题
     * @param topic 主题
     * @param observer 观察者
     */
    public static void observe(String topic,Observer observer) {
        if (observerMap.containsKey(topic)) {
            observerMap.get(topic).add(observer);
        } else {
            List<Observer> observers = new ArrayList<>();
            observers.add(observer);
            observerMap.put(topic,observers);
        }
    }

    /**
     * 被观察者加入消息队列
     * @param topic 主题
     * @param pusher 被观察者
     */
    public static void push(String topic,Pusher pusher) {
        if (pushMap.containsKey(topic)) {
            pushMap.get(topic).add(pusher);
        } else {
            List<Pusher> pushers = new ArrayList<>();
            pushers.add(pusher);
            pushMap.put(topic,pushers);
        }
    }

    /**
     * 被观察者推送消息
     * @param topic 主题
     * @param msg 消息
     * @param pusher 被观察者
     */
    public static void publishMsg(String topic,String msg,Pusher pusher) {
        if (!pushMap.containsKey(topic) || !pushMap.get(topic).contains(pusher)) {
            push(topic,pusher);
        }
        if (observerMap.containsKey(topic)) {
            List<Observer> observers = observerMap.get(topic);
            for (Observer observer : observers) {
                observer.getMsg(msg);
            }
        }
    }
}
