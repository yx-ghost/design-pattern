package decorator;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/11/18 18:43
 * @Description: 具体组件
 */
public class ConcreteComponent implements Component{
    public ConcreteComponent() {

    }

    @Override
    public void describe() {
        System.out.println("生成一个具体组件");
    }
}
