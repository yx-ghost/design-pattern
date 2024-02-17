package state;

import java.util.Objects;

/**
 * @Author: ye.ChenYu
 * @Date: 2024/2/17 11:45
 * @Description: 订单状态
 */
public enum OrderStateEnum {
    /**
     * 初始化
     */
    INIT(0) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            if (Objects.requireNonNull(eventEnum) == EventEnum.ORDER) {
                order.setStatus(PRE_PAID.status);
            } else {
                System.out.println("error");
            }
        }
    },
    /**
     * 待支付
     */
    PRE_PAID(1) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            switch (eventEnum){
                case PAID -> order.setStatus(PAID.status);
                case CANCEL -> order.setStatus(CANCEL.status);
                default -> System.out.println("error");
            }
        }
    },
    /**
     * 已支付
     */
    PAID(2) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            switch (eventEnum){
                case DELIVERY -> order.setStatus(DELIVERY.status);
                case CANCEL -> order.setStatus(CANCEL.status);
                default -> System.out.println("error");
            }
        }
    },
    /**
     * 派送中
     */
    DELIVERY(3) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            switch (eventEnum) {
                case SIGN -> order.setStatus(FINISH.status);
                case RETURN -> order.setStatus(FAILED.status);
                default -> System.out.println("error");
            }
        }
    },
    /**
     * 结束
     */
    FINISH(4) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            System.out.println("error");
        }
    },
    /**
     * 取消
     */
    CANCEL(5) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            System.out.println("error");
        }
    },
    /**
     * 退单
     */
    FAILED(6) {
        @Override
        protected void handlerOrder(Order order, EventEnum eventEnum) {
            System.out.println("error");
        }
    };



    /**
     * 订单状态
     */
    private final Integer status;

    protected abstract void handlerOrder(Order order, EventEnum eventEnum);
    OrderStateEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public static OrderStateEnum findByStatus(Integer status) {
        for (OrderStateEnum value : OrderStateEnum.values()) {
            if (Objects.equals(status, value.getStatus())) {
                return value;
            }

        }
        return null;
    }
}
