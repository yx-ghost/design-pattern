package chainofresponsibility;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 21:19
 * @Description: 最后的过滤器
 */
public class FinshFilter implements Filter{
    @Override
    public void doFilter() {
        System.out.println("我是最后一个过滤器");
    }
}
