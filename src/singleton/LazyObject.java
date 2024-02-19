package singleton;

/** 懒汉式加载单例
 * @Author: ye.ChenYu
 * @Date: 2024/2/19 20:57
 * @Description:
 */
public class LazyObject {
    private volatile static LazyObject INSTANCE;

    private LazyObject(){}

    public static LazyObject DoubleCheckLazyObject() {
        if (INSTANCE == null) {
            synchronized (LazyObject.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyObject();
                }
            }
        }
        return INSTANCE;
    }
}
