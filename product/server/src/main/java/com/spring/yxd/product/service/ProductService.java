package com.spring.yxd.product.service;

import com.spring.yxd.product.common.DecreaseStockInput;
import com.spring.yxd.product.common.ProductInfoOutput;
import com.spring.yxd.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by 杨贤达
 * 2018/6/16 13:20
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);


}
