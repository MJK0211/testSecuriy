package com.bit.house.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
public class ProductVO {
    private String productNo;
    private String sellerName;
    private String productName;
    private String modelName;
    private int customerPrice;
    private int sellPrice;
    private int purchasePrice;
    private String categoryType;
    private Date productCreatDate;
    private Date productUpdateDate;
    private String productMainImg;
    private String productSubImg1;
    private String productSubImg2;
    private String productSubImg3;
    private String productSubImg4;
    private int clickTotalCount;


}
