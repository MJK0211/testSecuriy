package com.bit.house.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
public class OrderListVO {
    private String orderNo;
    private String productNo;
    private String memberId;
    private String colorName;
    private int orderQty;
    private int totalPrice;
    private int usedPoint;
    private String recipient;
    private String orderAddr;
    private Date orderDate;
    private String orderType;
    private Date orderConfirmDate;
    private Date orderCancelDate;
    private String cancelReason;
}
