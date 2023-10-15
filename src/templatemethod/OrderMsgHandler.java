package templatemethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:19
 * @Description: 订单消息处理器
 */
public class OrderMsgHandler extends RocketMQHandlerTemplate{
    @Override
    public void before() {
        System.out.println("我是订单消息处理器，我开始接收订单消息");
    }

    @Override
    public void after() {
        System.out.println("订单消息处理完毕");
    }
}
