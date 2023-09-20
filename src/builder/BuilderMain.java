package builder;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 21:15
 * @Description: 建造者模式主类
 */
public class BuilderMain {
    public static void main(String[] args) {
        BuilderProduct builderProduct = BuilderProduct.builder()
                .name("牛爷爷")
                .age(18)
                .sex("男")
                .address("翻斗花园")
                .phone("1310000000")
                .build();
        System.out.println(builderProduct);
        builderProduct = BuilderProduct.builder()
                .name("壮壮妈")
                .age(18)
                .sex("女")
                .address("翻斗花园")
                .phone("1310000000")
                .build();
        System.out.println(builderProduct);
    }
}
