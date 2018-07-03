//package com.spring.yxd.apigateway;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
//import org.springframework.stereotype.Component;
//
///**
// * @author 杨贤达
// * @date 2018/7/1 16:39
// */
//@Component
//public class ZuulConfig {
//
//    @ConfigurationProperties(prefix = "zuul")
//    @RefreshScope
//    public ZuulProperties zuulProperties() {
//        return new ZuulProperties();
//    }
//}
