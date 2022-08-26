package com.barry.coupon.customer.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * 优惠券的状态
 * @author barry
 */
@Getter
@AllArgsConstructor
public enum CouponStatus {
    // 未使用
    AVAILABLE("未使用", 1),
    // 已用
    USED("已用",2),
    // 已注销
    INACTIVE("已经注销",3);

    private final String desc;
    private final Integer code;

    public static CouponStatus convert(Integer code) {
        if (code == null) {
            return null;
        }
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code))
                .findAny()
                .orElse(null);
    }
}
