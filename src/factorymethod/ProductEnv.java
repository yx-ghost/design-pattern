package factorymethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:06
 * @Description: 生产环境类
 */
public class ProductEnv extends AbstractEnv{
    @Override
    public void print() {
        System.out.println("This environment is product!");
    }
}
