package com.spring.yxd.product.service.impl;

import com.spring.yxd.product.dataobject.ProductCategory;
import com.spring.yxd.product.repository.ProductCategoryRepository;
import com.spring.yxd.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 杨贤达
 * 2018/6/16 13:34
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
