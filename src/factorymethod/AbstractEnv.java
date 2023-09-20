package factorymethod;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:09
 * @Description: 抽象环境类
 */
public abstract class AbstractEnv {
    protected String name;

    public String getName() {
        return name;
    }


    public abstract void print();
}
