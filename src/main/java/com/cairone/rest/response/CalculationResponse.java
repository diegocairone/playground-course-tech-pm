package com.cairone.rest.response;

import com.cairone.rest.request.CalculationRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class CalculationResponse {

    private Integer numA;
    private Integer numB;
    private CalculationRequest.Operation op;
    private Integer result;
    private String opDescription;

}
