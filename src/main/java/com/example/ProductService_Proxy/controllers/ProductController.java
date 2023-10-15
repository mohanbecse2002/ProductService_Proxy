package com.example.ProductService_Proxy.controllers;

import com.example.ProductService_Proxy.dtos.FakestoreProductDto;
import com.example.ProductService_Proxy.dtos.ProductDto;
import com.example.ProductService_Proxy.services.IProductService;
import org.springframework.web.bind.annotation.*;

//RestController is like router in python/flask.
@RestController
//This controller is responsible for all /products endpoints and all suffix under it.
//So, have a common mapping at this level.
@RequestMapping("/products")
public class ProductController {

    //Dependency Injection
    IProductService productService;
    public ProductController(IProductService productService){
        this.productService = productService;
    }

    //Alternate method for GetMapping is @RequestMapping(method = {RequestMethod.GET})
    //the 'path' allows to configure multiple routes for the same function.
    @GetMapping( path={"","/"} )
    public String getAllProducts() {
        return "Returns all products!";
    }

    //'@PathVariable' reads {id} from URI and converts to 'Long id'.
    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long id) {
        String res = productService.getSingleProduct(id);
        return res;
    }

    @PostMapping
    //'@RequestBody' reads the JSON body from HTML request, and maps it to the 'productDto' object.
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Adding new product: " + productDto;
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        return ( "Updating the product: " + id + " with new data: " + productDto);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return "Deleting the product: " + id;
    }
}
