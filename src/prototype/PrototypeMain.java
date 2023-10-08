package prototype;

import java.util.List;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/21 22:51
 * @Description: 原型模式主类
 */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype(1,"第一",2L, List.of(3,4,5,6));
        Prototype clone = (Prototype) prototype.clone();
        Prototype deepClone = prototype.deepClone();
        System.out.println(prototype);
        System.out.println(clone);
        System.out.println(deepClone);

        prototype.setNum(200);
        prototype.setName("第二");
        prototype.setLongNum(300L);
        prototype.setNumList(List.of(0,0,0));
        System.out.println(prototype);
        System.out.println(clone);
        System.out.println(deepClone);
    }
}
