package abstractfactory;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:39
 * @Description: 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract Phone phoneProduce();
    public abstract Computer computerProduce();
}
