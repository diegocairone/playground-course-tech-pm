package com.cairone.rest.ctrl;

import com.cairone.core.calc.AritmeticCalc;
import com.cairone.rest.request.CalculationRequest;
import com.cairone.rest.response.CalculationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class CalculationCtrl {

    private final AritmeticCalc aritmeticCalc;

    @PostMapping
    public CalculationResponse doCalculation(@RequestBody CalculationRequest request) {

        CalculationResponse.CalculationResponseBuilder builder = CalculationResponse.builder()
                .withNumA(request.getNumA())
                .withNumB(request.getNumB())
                .withOp(request.getOp());

        if (request.getOp().equals(CalculationRequest.Operation.SUM)) {
            Integer result = aritmeticCalc.sumOf(request.getNumA(), request.getNumB());
            String opDescription = String.format("%s + %s = %s", request.getNumA(), request.getNumB(), result);
            return builder.withResult(result).withOpDescription(opDescription).build();
        } else if (request.getOp().equals(CalculationRequest.Operation.SUBTRACT)) {
            Integer result = aritmeticCalc.subtractionOf(request.getNumA(), request.getNumB());
            String opDescription = String.format("%s - %s = %s", request.getNumA(), request.getNumB(), result);
            return builder.withResult(result).withOpDescription(opDescription).build();
        } else if (request.getOp().equals(CalculationRequest.Operation.MULTIPLY)) {
            Integer result = aritmeticCalc.multiplicationOf(request.getNumA(), request.getNumB());
            String opDescription = String.format("%s * %s = %s", request.getNumA(), request.getNumB(), result);
            return builder.withResult(result).withOpDescription(opDescription).build();
        } else if (request.getOp().equals(CalculationRequest.Operation.DIVIDE)) {
            Integer result = aritmeticCalc.divisionOf(request.getNumA(), request.getNumB());
            String opDescription = String.format("%s / %s = %s", request.getNumA(), request.getNumB(), result);
            return builder.withResult(result).withOpDescription(opDescription).build();
        }

        throw new UnsupportedOperationException("Operation not supported!");
    }
}
