package abstractfactory;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 21:04
 * @Description: 华为电脑类
 */
public class HuaweiComputer extends Computer{
    @Override
    public void print() {
        System.out.println("我是华为电脑");
    }
}
