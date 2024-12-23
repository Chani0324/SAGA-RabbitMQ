package com.sparta.saga.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private UUID paymentId;
    private String userId;

    private Integer payAmount;

    private String payStatus;
}
