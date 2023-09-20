package abstractfactory;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 21:03
 * @Description: 小米电脑类
 */
public class XiaomiComputer extends Computer{
    @Override
    public void print() {
        System.out.println("我是小米电脑");
    }
}
