package decorator;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/15 20:33
 * @Description: 装饰器模式主类
 */
public class DecorateMain {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorate decorate = new BeautifulDecorate(component);
        decorate.decorate();
    }
}
