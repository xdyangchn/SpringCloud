package com.spring.yxd.product.service;

import com.spring.yxd.product.ProductApplicationTests;
import com.spring.yxd.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 杨贤达
 * 2018/6/16 13:34
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 12));
        Assert.assertTrue(list.size() > 0);
    }
}