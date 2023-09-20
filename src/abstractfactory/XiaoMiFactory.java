package abstractfactory;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:41
 * @Description: 小米工厂类
 */
public class XiaoMiFactory extends AbstractFactory {
    @Override
    public Phone phoneProduce() {
        System.out.println("生产小米手机");
        return new XiaoMiPhone();
    }

    @Override
    public Computer computerProduce() {
        System.out.println("生产小米电脑");
        return new XiaomiComputer();
    }
}
