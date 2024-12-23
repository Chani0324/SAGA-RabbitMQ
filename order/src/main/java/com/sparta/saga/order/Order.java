package com.sparta.saga.order;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

// 실제론 entity 부분
@Builder
@Data
@ToString
public class Order {
    private UUID orderId;
    private String userId;
    private String orderStatus; // 실제론 Enum 타입으로 하는게 좋음
    private String errorType; // 실제론 Enum 타입으로 하는게 좋음

    public void cancelOrder(String receiveErrorType) {
        orderStatus = "CANCELLED";
        errorType = receiveErrorType;
    }
}
