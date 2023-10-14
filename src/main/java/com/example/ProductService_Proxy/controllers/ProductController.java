package com.example.ProductService_Proxy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController is like router in python/flask.
@RestController
//This controller is responsible for all /products endpoints and all suffix under it.
//So, have a common mapping at this level.
@RequestMapping("/products")
public class ProductController {

    //Alternate method for GetMapping is @RequestMapping(method = {RequestMethod.GET})
    //the 'path' allows to configure multiple routes for the same function.
    @GetMapping( path={"","/"} )
    public String getAllProducts() {
        return "Returns all products!";
    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long id) {
        return "Returns single product for id: " + id;
    }


}
