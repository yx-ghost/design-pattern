package decorator;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/11/18 18:44
 * @Description: 抽象装饰器
 */
public abstract class Decorate {
    protected Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    public abstract void decorate();
}
