package com.example.ProductService_Proxy.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FakestoreRatingDto {
    private double rate;
    private Long count;
}
