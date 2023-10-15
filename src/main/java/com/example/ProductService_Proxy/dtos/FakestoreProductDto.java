package com.example.ProductService_Proxy.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FakestoreProductDto {
    private String id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private FakestoreRatingDto rating;
}
