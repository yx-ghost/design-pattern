package composite;

import java.util.List;

/** 叶子节点
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:56
 * @Description:
 */
public class Leaf implements Component{
    @Override
    public void addSubComponent(Component component) {
        System.out.println("不能添加子节点");
    }

    @Override
    public void removeSubComponent(Component component) {
        System.out.println("不能删除子节点");
    }

    @Override
    public List<Component> getSubComponent() {
        return List.of();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void doSomething() {
        System.out.println("我是叶子节点，没有子节点了");
    }
}
