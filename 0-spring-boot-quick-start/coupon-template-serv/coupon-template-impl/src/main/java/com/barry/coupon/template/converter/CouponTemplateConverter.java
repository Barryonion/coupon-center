package com.barry.coupon.template.converter;

import com.barry.coupon.template.api.beans.CouponTemplateInfo;
import com.barry.coupon.template.dao.entity.CouponTemplate;

public class CouponTemplateConverter {

    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {
        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }

}
