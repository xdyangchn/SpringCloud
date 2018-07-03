package com.spring.yxd.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 杨贤达
 * 2018/6/14 23:31
 */
@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字。 */
    private String categoryName;

    /** 类目编号。 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
