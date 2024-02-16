package bridge;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/11/18 19:46
 * @Description:
 */
public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void describe() {
        this.color.describe();
        System.out.println("正方形");
    }
}
