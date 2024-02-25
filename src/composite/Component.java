package composite;

import java.util.List;

/** 通用组件
 * @Author: ye.ChenYu
 * @Date: 2024/2/25 11:47
 * @Description:
 */
public interface Component {
    /**
     *  添加一个子组件
     * @param component 组件对象
     */
    void addSubComponent(Component component);

    /**
     * 移除一个子组件
     * @param component 组件对象
     */
    void removeSubComponent(Component component);

    /**
     * 获取子组件对象
     *
     * @return 持有的子组件对象
     */
    List<Component> getSubComponent();

    int getCount();

    void doSomething();
}
