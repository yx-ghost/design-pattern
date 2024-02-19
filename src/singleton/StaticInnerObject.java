package singleton;

/** 静态内部类单例
 * @Author: ye.ChenYu
 * @Date: 2024/2/19 21:01
 * @Description:
 */
public class StaticInnerObject {

    private StaticInnerObject(){}

    private static class Holder{
        public static final StaticInnerObject INSTANCE = new StaticInnerObject();
    }

    public static StaticInnerObject getInstance(){
        return Holder.INSTANCE;
    }
}
