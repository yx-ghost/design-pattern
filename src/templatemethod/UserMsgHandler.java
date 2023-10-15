package templatemethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:21
 * @Description: 用户消息处理器
 */
public class UserMsgHandler extends RocketMQHandlerTemplate{
    @Override
    public void before() {
        System.out.println("我是用户消息处理器，我开始接收用户消息");
    }

    @Override
    public void after() {
        System.out.println("用户消息处理完毕");
    }
}
