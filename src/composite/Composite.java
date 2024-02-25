package composite;

import java.util.ArrayList;
import java.util.List;

/** 组合对象，即非叶子节点
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:50
 * @Description:
 */
public class Composite implements Component {
    private final List<Component> data = new ArrayList<>();

    @Override
    public void addSubComponent(Component component) {
        data.add(component);
    }

    @Override
    public void removeSubComponent(Component component) {
        data.remove(component);
    }

    @Override
    public List<Component> getSubComponent() {
        return this.data;
    }

    @Override
    public int getCount() {
        int count = this.data.size();
        for (Component component : data) {
            count += component.getCount();
        }
        return count;
    }

    @Override
    public void doSomething() {
        System.out.println("我有" + getCount() + "个子节点");
    }
}
