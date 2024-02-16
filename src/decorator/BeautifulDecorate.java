package decorator;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/11/18 18:45
 * @Description: 具体装饰器
 */
public class BeautifulDecorate extends Decorate{
    public BeautifulDecorate(Component component) {
        super(component);
    }

    @Override
    public void decorate() {
        System.out.println("展示装饰后的组件");
        component.describe();
    }
}
