package factorymethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:26
 * @Description: 工厂方法类的主方法
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        AbstractEnv dev = EnviormentEnum.findByEnvName("dev");
        dev.print();
        AbstractEnv prod = EnviormentEnum.findByEnvName("prod");
        prod.print();
    }
}
