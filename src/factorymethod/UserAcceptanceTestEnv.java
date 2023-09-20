package factorymethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:07
 * @Description: 验收环境类
 */
public class UserAcceptanceTestEnv extends AbstractEnv{
    @Override
    public void print() {
        System.out.println("This environment is user acceptance test!");
    }
}
