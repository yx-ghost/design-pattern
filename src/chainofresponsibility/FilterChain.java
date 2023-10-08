package chainofresponsibility;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 21:13
 * @Description: 责任链类
 */
public class FilterChain {
    private int pos = 0;
    private int n;
    private Filter[] filters;

    public FilterChain() {
        filters = new Filter[0];
    }

    public void doFilter() {
        while (pos < n) {
            Filter filter = filters[pos++];
            filter.doFilter();
        }
        System.out.println("所有责任链执行完毕");
        pos = 0;

    }

    public void addFilter(Filter filter) {
        for (Filter filter1 : filters) {
            if (filter == filter1) {
                return;
            }
        }

        if (n == filters.length) {
            Filter[] newFilters = new Filter[n+1];
            System.arraycopy(filters,0,newFilters,0,n);
            filters = newFilters;
        }
        filters[n++] = filter;
    }
}
