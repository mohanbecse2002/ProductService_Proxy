package com.example.ProductService_Proxy.services;

import com.example.ProductService_Proxy.dtos.FakestoreProductDto;
import com.example.ProductService_Proxy.dtos.ProductDto;

public interface IProductService {
    //Get All product
    String getAllProduct();

    //Get single product
    ProductDto getSingleProduct(Long id);

    //Add new product
    String addNewProduct(ProductDto productDto);

    //Update a product
    String updateProduct(Long id);

    //Delete a product
    String deleteProduct(Long id);
}
