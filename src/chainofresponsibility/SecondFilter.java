package chainofresponsibility;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 21:19
 * @Description: 第二个过滤器
 */
public class SecondFilter implements Filter{
    @Override
    public void doFilter() {
        System.out.println("我是第二个过滤器");
    }
}
