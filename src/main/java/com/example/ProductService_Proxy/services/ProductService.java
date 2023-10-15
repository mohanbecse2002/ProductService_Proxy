package com.example.ProductService_Proxy.services;

import com.example.ProductService_Proxy.dtos.FakestoreProductDto;
import com.example.ProductService_Proxy.dtos.ProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*
Only after defining it as '@Service' the dependency injection of this class inside other classes works.
Otherwise, it throws the below error
        Description:
        Parameter 0 of constructor in com.example.ProductService_Proxy.controllers.ProductController required a bean of type 'com.example.ProductService_Proxy.services.IProductService' that could not be found.
        Action:
        Consider defining a bean of type 'com.example.ProductService_Proxy.services.IProductService' in your configuration.
*/
@Service
public class ProductService implements IProductService {

    //'RestTemplate' is the HTTP client library in spring. Dependency Injection used here.
    private RestTemplateBuilder restTemplateBuilder;
    public ProductService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }


    //Get All product
    @Override
    public String getAllProduct(){
        return null;
    }

    //Get single product
    @Override
    public String getSingleProduct(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        //getForEntitye(Url, Resonsetype Class, Input Parameter
        FakestoreProductDto fakestoreProductDto =
                restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", FakestoreProductDto.class, id).getBody();
        System.out.println("fakstoreProdctDto:" + fakestoreProductDto);

        String res = fakestoreProductDto.toString();
        System.out.println("res:" + res
        );

        return res;
    }

    //Add new product
    @Override
    public String addNewProduct(ProductDto productDto) {
        return  null;
    }

    //Update a product
    @Override
    public String updateProduct(Long id) {
        return null;
    }

    //Delete a product
    @Override
    public String deleteProduct(Long id) {
        return null;
    }
}
