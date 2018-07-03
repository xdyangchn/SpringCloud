package com.spring.yxd.product.common;

import lombok.Data;

/**
 * 减库存入参
 * Created by 杨贤达
 * 2018/6/18 18:31
 */
@Data
public class DecreaseStockInput {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
