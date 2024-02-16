package bridge;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/11/18 19:45
 * @Description: 形状接口
 */
public abstract class Shape {
    Color color;



    public void setColor(Color color) {
        this.color = color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    protected abstract void describe();
}
