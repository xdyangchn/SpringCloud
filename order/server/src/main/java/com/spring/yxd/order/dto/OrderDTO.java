package com.spring.yxd.order.dto;

import com.spring.yxd.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 杨贤达
 * 2018/6/16 17:43
 */
@Data
public class OrderDTO {

    /** 订单id. */
    private String orderId;

    /** 买家姓名。 */
    private String buyerName;

    /** 买家手机号。 */
    private String buyerPhone;

    /** 卖家地址。 */
    private String buyerAddress;

    /** 买家微信openid. */
    private String buyerOpenid;

    /** 订单总金额。 */
    private BigDecimal orderAmount;

    /** 订单状态，默认为0新下单。 */
    private Integer orderStatus;

    /** 支付状态，默认为0未支付。 */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
