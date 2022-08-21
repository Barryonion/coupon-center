package com.barry.coupon.template.service.intf;

import com.barry.coupon.template.api.beans.CouponTemplateInfo;
import com.barry.coupon.template.api.beans.PagedCouponTemplateInfo;
import com.barry.coupon.template.api.beans.TemplateSearchParams;

import java.util.Collection;
import java.util.Map;

public interface CouponTemplateService {

    // 创建优惠券模版
    CouponTemplateInfo createTemplate(CouponTemplateInfo request);

    CouponTemplateInfo cloneTemplate(Long templateId);

    // 模版查询（分页）
    PagedCouponTemplateInfo search(TemplateSearchParams request);

    // 通过模版ID查询优惠券模版
    CouponTemplateInfo loadTemplateInfo(Long id);

    // 让优惠券模版无效
    void deleteTemplate(Long id);

    // 批量查询
    // Map是模版ID，key是模版详情
    Map<Long, CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);


}
