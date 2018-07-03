package com.spring.yxd.order.message;

import com.spring.yxd.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author 杨贤达
 * @date 2018/6/30 17:45
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

//    @StreamListener(StreamClient.INPUT)
//    public void process(String message) {
//        log.info("StreamReceiver: {}", message);
//    }

    /**
     * 接收orderDTO对象 消息
     * @param message
     */
    @StreamListener(value = StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(OrderDTO message) {
        log.info("StreamReceiver: {}", message);
        return "received.";
    }

    /**
     * 消费 上面方法消费orderDTO后 返回的消息
     * @param message
     */
    @StreamListener(value = StreamClient.INPUT2)
    public void process2(String message) {
        log.info("StreamReceiver2: {}", message);
    }

}
