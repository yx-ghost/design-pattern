package factorymethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:08
 * @Description: 研发环境类
 */
public class DevelopmentEnv extends AbstractEnv{
    @Override
    public void print() {
        System.out.println("This environment is development!");
    }
}
