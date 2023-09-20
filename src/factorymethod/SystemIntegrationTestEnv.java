package factorymethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:07
 * @Description: 测试环境类
 */
public class SystemIntegrationTestEnv extends AbstractEnv{
    @Override
    public void print() {
        System.out.println("This environment is system integration test!");
    }
}
