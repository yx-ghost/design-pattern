package composite;

/**组合模式主类
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:42
 * @Description:
 */
public class CompositeMain {
    public static void main(String[] args) {
        Component component1 = new Composite();
        Component component2 = new Composite();
        Component component3 = new Composite();
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        component1.addSubComponent(component2);
        component1.addSubComponent(component3);
        component2.addSubComponent(leaf1);
        component2.addSubComponent(leaf2);
        component3.addSubComponent(leaf3);

        component1.doSomething();
        component2.doSomething();
        component3.doSomething();
    }
}
