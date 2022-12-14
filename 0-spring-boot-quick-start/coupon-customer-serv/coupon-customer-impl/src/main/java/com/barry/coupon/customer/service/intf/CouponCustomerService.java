package com.barry.coupon.customer.service.intf;

import com.barry.coupon.calculation.api.beans.ShoppingCart;
import com.barry.coupon.calculation.api.beans.SimulationOrder;
import com.barry.coupon.calculation.api.beans.SimulationResponse;
import com.barry.coupon.customer.api.beans.RequestCoupon;
import com.barry.coupon.customer.api.beans.SearchCoupon;
import com.barry.coupon.customer.dao.entity.Coupon;
import com.barry.coupon.template.api.beans.CouponInfo;

import java.util.List;

/**
 * 用户对接服务
 */
public interface CouponCustomerService {

    /**
     * 领券接口
     * */
    Coupon requestCoupon(RequestCoupon request);

    /**
     * 核销优惠券
     * */
    ShoppingCart placeOrder(ShoppingCart info);

    /**
     * 优惠券金额试算
     * */
    SimulationResponse simulateOrderPrice(SimulationOrder order);

    void deleteCoupon(Long userId, Long couponId);

    /**
     * 查询用户优惠券
     * */
    List<CouponInfo> findCoupon(SearchCoupon request);
}
