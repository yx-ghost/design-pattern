package adapter;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 20:22
 * @Description: 适配器模式主类
 */
public class AdapterMain {
    public static void main(String[] args) {
        AdapterRole adapterRole = new AdapterRole();
        adapterRole.printA();
        adapterRole.printB();
    }
}
