package state;

/**
 * @Author: ye.ChenYu
 * @Date: 2024/2/17 11:38
 * @Description: 事件枚举
 */
public enum EventEnum {
    /**
     * 下发订单
     */
    ORDER,
    /**
     * 打款
     */
    PAID,
    /**
     * 物流派送
     */
    DELIVERY,
    /**
     * 签收
     */
    SIGN,
    /**
     * 取消订单
     */
    CANCEL,
    /**
     * 退货
     */
    RETURN
}
