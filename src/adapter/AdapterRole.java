package adapter;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/10/8 20:21
 * @Description: 适配器角色
 */
public class AdapterRole {
    private final SourceRoleA sourceRoleA = new SourceRoleA();
    private final SourceRoleB sourceRoleB = new SourceRoleB();
    public void printA() {
        sourceRoleA.printSourceA();
    }

    public void printB() {
        sourceRoleB.printSourceB();
    }
}
