package com.barry.coupon.customer.controller;


import com.barry.coupon.calculation.api.beans.ShoppingCart;
import com.barry.coupon.calculation.api.beans.SimulationOrder;
import com.barry.coupon.calculation.api.beans.SimulationResponse;
import com.barry.coupon.customer.api.beans.RequestCoupon;
import com.barry.coupon.customer.api.beans.SearchCoupon;
import com.barry.coupon.customer.dao.entity.Coupon;
import com.barry.coupon.customer.service.intf.CouponCustomerService;
import com.barry.coupon.template.api.beans.CouponInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("coupon-customer")
public class CouponCustomerController {

    @Autowired
    private CouponCustomerService customerService;

    @PostMapping("requestCoupon")
    public Coupon requestCoupon(@Valid @RequestBody RequestCoupon request) {
        return customerService.requestCoupon(request);
    }

    /**
     * 用户删除优惠券
     * */
    @DeleteMapping("deleteCoupon")
    public void deleteCoupon(@RequestParam("userId") Long userId,
                             @RequestParam("couponId") Long couponId) {
        customerService.deleteCoupon(userId, couponId);
    }

    /**
     * 用户模拟计算每个优惠券的优惠价格
     */
    @PostMapping("simulateOrder")
    public SimulationResponse simulate(@Valid @RequestBody SimulationOrder order) {
        return customerService.simulateOrderPrice(order);
    }

    /**
     * 核销券 ResponseEntity - 指定返回状态码 - 课后思考题
     */
    @PostMapping("placeOrder")
    public ShoppingCart checkout(@Valid @RequestBody ShoppingCart info) {
        return customerService.placeOrder(info);
    }

    /**
     * 查询用户优惠券
     */
    @PostMapping("findCoupon")
    public List<CouponInfo> findCoupon(@Valid @RequestBody SearchCoupon request) {
        return customerService.findCoupon(request);
    }

}
