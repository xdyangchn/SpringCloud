package com.spring.yxd.product.service;

import com.spring.yxd.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by 杨贤达
 * 2018/6/16 13:33
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
