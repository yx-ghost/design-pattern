package singleton;

/** 饿汉式单例
 * @Author: ye.ChenYu
 * @Date: 2024/2/19 21:00
 * @Description:
 */
public class HungryObject {

    private static final HungryObject instance = new HungryObject();
    private HungryObject(){}

    public static HungryObject getInstance(){
        return instance;
    }

}
