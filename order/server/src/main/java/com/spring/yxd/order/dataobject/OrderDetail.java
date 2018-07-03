package com.spring.yxd.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 杨贤达
 * 2018/6/16 16:42
 */
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称。 */
    private String productName;

    /** 商品价格。 */
    private BigDecimal productPrice;

    /** 商品数量。 */
    private Integer productQuantity;

    /** 商品小图。 */
    private String productIcon;

}
