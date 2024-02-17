package state;

import java.util.Objects;

/**
 * @Author: ye.ChenYu
 * @Date: 2024/2/17 11:38
 * @Description: 状态模式主类
 */
public class StateMain {
    public static void main(String[] args) {
        Order order = new Order();
        order.setStatus(OrderStateEnum.INIT.getStatus());

        System.out.println("下单");
        Objects.requireNonNull(OrderStateEnum.findByStatus(order.getStatus())).handlerOrder(order,EventEnum.ORDER);
        System.out.println(order.getStatus());

        System.out.println("支付");
        Objects.requireNonNull(OrderStateEnum.findByStatus(order.getStatus())).handlerOrder(order,EventEnum.PAID);
        System.out.println(order.getStatus());

        System.out.println("派送");
        Objects.requireNonNull(OrderStateEnum.findByStatus(order.getStatus())).handlerOrder(order,EventEnum.DELIVERY);
        System.out.println(order.getStatus());

        System.out.println("签收");
        Objects.requireNonNull(OrderStateEnum.findByStatus(order.getStatus())).handlerOrder(order,EventEnum.SIGN);
        System.out.println(order.getStatus());
    }
}
