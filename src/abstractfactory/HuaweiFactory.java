package abstractfactory;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:49
 * @Description: 华为工厂类
 */
public class HuaweiFactory extends AbstractFactory{
    @Override
    public Phone phoneProduce() {
        System.out.println("生产华为手机");
        return new HuaweiPhone();
    }

    @Override
    public Computer computerProduce() {
        System.out.println("生产华为电脑");
        return new HuaweiComputer();
    }
}
