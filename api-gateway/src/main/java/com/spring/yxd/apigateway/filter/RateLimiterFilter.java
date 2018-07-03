package com.spring.yxd.apigateway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.spring.yxd.apigateway.exception.RateLimiterException;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SERVLET_DETECTION_FILTER_ORDER;

/**
 * 限流
 * @author 杨贤达
 * @date 2018/7/1 17:31
 */
@Component
public class RateLimiterFilter extends ZuulFilter {

    /**
     * 使用 Google 的 Guava 提供的令牌桶算法
     */
    private static final RateLimiter RATE_LIMITER = RateLimiter.create(100);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return SERVLET_DETECTION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        // RATE_LIMITER.tryAcquire() 意思为到令牌桶取 1 个令牌，未获取到抛出异常
        if (!RATE_LIMITER.tryAcquire()) {
            throw new RateLimiterException();
        }

        return null;
    }
}
