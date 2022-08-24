package com.barry.coupon.calculation.controller;

import com.barry.coupon.calculation.controller.service.intf.CouponCalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("calculator")
public class CouponCalculationController {
    @Autowired
    private CouponCalculationService calculationService;


}
