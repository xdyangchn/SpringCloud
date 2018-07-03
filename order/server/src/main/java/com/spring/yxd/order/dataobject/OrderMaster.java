package com.spring.yxd.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 杨贤达
 * 2018/6/16 16:34
 */
@Data
@Entity
public class OrderMaster {

    /** 订单id. */
    @Id
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

    /** 创建时间。 */
    private Date createTime;

    /** 更新时间。 */
    private Date updateTime;

}
