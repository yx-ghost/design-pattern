package builder;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 21:26
 * @Description: 建造者模式产品类
 */
public class BuilderProduct {
    private String name;
    private String address;
    private int age;
    private String sex;
    private String phone;

    public static Builder builder() {
        return new Builder(new BuilderProduct());
    }


    @Override
    public String toString() {
        return "BuilderProduct{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    /**
     * 建造者，负责生产对应的产品
     */
    public static class Builder{

        private final BuilderProduct builderProduct;

        public Builder(BuilderProduct builderProduct) {
            this.builderProduct = builderProduct;
        }

        public Builder name(String name) {
            builderProduct.name = name;
            return this;
        }
        public Builder address(String address) {
            builderProduct.address = address;
            return this;
        }
        public Builder age(int age) {
            builderProduct.age = age;
            return this;
        }
        public Builder sex(String sex) {
            builderProduct.sex = sex;
            return this;
        }
        public Builder phone(String phone) {
            builderProduct.phone = phone;
            return this;
        }
        public BuilderProduct build() {
            return this.builderProduct;
        }
    }
}
