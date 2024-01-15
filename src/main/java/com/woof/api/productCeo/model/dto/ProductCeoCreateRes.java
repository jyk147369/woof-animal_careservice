package com.woof.api.productCeo.model.dto;

import com.woof.api.productCeo.model.dto.ProductCeoCreateResult;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductCeoCreateRes {
    private Boolean isSuccess;
    private Integer code;
    private String message;
    private ProductCeoCreateResult result;
    private Boolean success;
}
