package com.spring.yxd.order.repository;

import com.spring.yxd.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 杨贤达
 * 2018/6/16 16:47
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
