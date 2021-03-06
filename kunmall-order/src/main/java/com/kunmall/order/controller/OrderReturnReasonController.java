package com.kunmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kunmall.order.entity.OrderReturnReasonEntity;
import com.kunmall.order.service.OrderReturnReasonService;
import com.kunmall.common.utils.PageUtils;
import com.kunmall.common.utils.CommonResult;



/**
 * 退货原因
 *
 * @author kun
 * @email ghk_1998@163.com
 * @date 2021-02-24 16:25:20
 */
@RestController
@RequestMapping("order/orderreturnreason")
public class OrderReturnReasonController {
    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:orderreturnreason:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = orderReturnReasonService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:orderreturnreason:info")
    public CommonResult info(@PathVariable("id") Long id){
		OrderReturnReasonEntity orderReturnReason = orderReturnReasonService.getById(id);

        return CommonResult.ok().put("orderReturnReason", orderReturnReason);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:orderreturnreason:save")
    public CommonResult save(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.save(orderReturnReason);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:orderreturnreason:update")
    public CommonResult update(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.updateById(orderReturnReason);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:orderreturnreason:delete")
    public CommonResult delete(@RequestBody Long[] ids){
		orderReturnReasonService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}
