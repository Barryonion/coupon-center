package com.barry.coupon.customer.service;

import com.barry.coupon.customer.dao.entity.Coupon;
import com.barry.coupon.template.api.beans.CouponInfo;

public class CouponConverter {

    public static CouponInfo converToCoupon(Coupon coupon) {

        return CouponInfo.builder()
                .id(coupon.getId())
                .status(coupon.getStatus().getCode())
                .templateId(coupon.getTemplateId())
                .shopId(coupon.getShopId())
                .userId(coupon.getUserId())
                .template(coupon.getTemplateInfo())
                .build();
    }

}
