package com.spring.yxd.product.service;

import com.spring.yxd.product.ProductApplicationTests;
import com.spring.yxd.product.common.DecreaseStockInput;
import com.spring.yxd.product.common.ProductInfoOutput;
import com.spring.yxd.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 杨贤达
 * 2018/6/16 13:29
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findList() throws Exception {
        List<ProductInfoOutput> list = productService.findList(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}