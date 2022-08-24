package com.barry.coupon.calculation.controller.service;

import com.alibaba.fastjson.JSON;
import com.barry.coupon.calculation.api.beans.ShoppingCart;
import com.barry.coupon.calculation.api.beans.SimulationOrder;
import com.barry.coupon.calculation.api.beans.SimulationResponse;
import com.barry.coupon.calculation.controller.service.intf.CouponCalculationService;
import com.barry.coupon.calculation.template.CouponTemplateFactory;
import com.barry.coupon.calculation.template.RuleTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Service
public class CouponCalculationServiceImpl implements CouponCalculationService {

    @Autowired
    private CouponTemplateFactory couponProcessorFactory;

    // 优惠券结算
    // 这里通过Factory类决定使用哪个底层Rule，底层规则对上层透明
    @Override
    public ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart) {
        log.info("calculate order price: {}", JSON.toJSONString(cart));
        RuleTemplate ruleTemplate = couponProcessorFactory.getTemplate(cart);
        return ruleTemplate.calculate(cart);
    }

    @Override
    public SimulationResponse simulateOrder(SimulationOrder cart) {
        return null;
    }
}
