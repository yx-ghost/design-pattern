package factorymethod;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/20 20:02
 * @Description: 环境枚举，用于模拟工厂模式
 */
public enum EnviormentEnum {
    DEV("dev", DevelopmentEnv::new),
    PROD("prod",ProductEnv::new),
    SIT("sit",SystemIntegrationTestEnv::new),
    UAT("uat",UserAcceptanceTestEnv::new)
    ;

    private final String envName;



    private final Supplier<AbstractEnv> abstractEnv;

    EnviormentEnum(String envName, Supplier<AbstractEnv> abstractEnv) {
        this.envName = envName;
        this.abstractEnv = abstractEnv;
    }

    public static AbstractEnv findByEnvName(String envName) {
        if (Objects.isNull(envName) || envName.isEmpty()) {
            throw new RuntimeException("参数不能为空！");
        }
        for (EnviormentEnum value : EnviormentEnum.values()) {
            if (value.envName.equals(envName)) {
                return value.abstractEnv.get();
            }
        }
        throw new RuntimeException("没有找到这个环境！");
    }

}
