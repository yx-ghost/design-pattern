package templatemethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 11:14
 * @Description: 模板方法模式主类
 */
public class TemplateMain {
    public static void main(String[] args) {
        RocketMQHandlerTemplate rocketMQHandlerTemplate = new OrderMsgHandler();
        rocketMQHandlerTemplate.onMessage();

        rocketMQHandlerTemplate = new UserMsgHandler();
        rocketMQHandlerTemplate.onMessage();
    }
}
