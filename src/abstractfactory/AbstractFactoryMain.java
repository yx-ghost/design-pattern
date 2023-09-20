package abstractfactory;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:54
 * @Description: 抽象工厂运行类
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        AbstractFactory huaweiFactory = new HuaweiFactory();

        Phone xiaoMiPhone = xiaoMiFactory.phoneProduce();
        xiaoMiPhone.print();
        Computer xiaoMiComputer = xiaoMiFactory.computerProduce();
        xiaoMiComputer.print();

        Phone huaweiPhone = huaweiFactory.phoneProduce();
        huaweiPhone.print();
        Computer huaweiComputer = huaweiFactory.computerProduce();
        huaweiComputer.print();
    }
}
