package bridge;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/11/18 19:45
 * @Description: 桥接模式主类
 */
public class BridgeMain {
    public static void main(String[] args) {
        Color red = new Red();
        Shape shape = new Square(red);
        shape.describe();
        Color green = new Green();
        shape.setColor(green);
        shape.describe();
    }
}
