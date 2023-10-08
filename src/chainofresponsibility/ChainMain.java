package chainofresponsibility;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 21:13
 * @Description: 责任链主类
 */
public class ChainMain {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter());
        filterChain.addFilter(new SecondFilter());
        filterChain.addFilter(new FinshFilter());
        filterChain.doFilter();
    }
}
