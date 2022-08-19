package com.barry.coupon.template.api.beans;

import com.barry.coupon.template.api.beans.rules.TemplateRule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 创建优惠券模版
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String desc;
    @NotNull
    private String type;
    private Long shopId;
    /**
     * 优惠券规则
     **/
    @NotNull
    private TemplateRule rule;
    private Boolean available;
}
