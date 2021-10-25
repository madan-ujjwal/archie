package com.archie.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseWrapper<T> {

    private T data;
    private List<ApiError> errors;

    public ResponseWrapper(T data) {
        this(data, new ArrayList<>());
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ApiError {
        private Long code;
        private String message;
    }
}
