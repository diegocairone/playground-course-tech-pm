package com.cairone.rest.resource;

import lombok.Builder;
import lombok.RequiredArgsConstructor;


public class ResultResource {

    private final Integer result;

    public ResultResource(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }
}
