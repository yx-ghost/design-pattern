package chainofresponsibility;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 21:19
 * @Description: 第一个过滤器
 */
public class FirstFilter implements Filter{
    @Override
    public void doFilter() {
        System.out.println("我是第一个过滤器");
    }
}
