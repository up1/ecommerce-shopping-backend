package com.tcrb.shoppingcart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/api/v1/products")
    public List<ResponseProduct> getProductList(
            @RequestParam("age_id") Integer ageId,
            @RequestParam("gender_id") Integer genderId)
    {
        List<ResponseProduct> responseProductList = new ArrayList<>();


//        ResponseProduct responseProduct = new ResponseProduct();
//        responseProduct.id = 1;
//        responseProduct.name = "product1";
//        responseProduct.price = 100.00;
//        responseProduct.brand = "Adda";
//        responseProductList.add(responseProduct);

        return responseProductList;
    }

    @GetMapping("/api/v1/products/{id}")
    public ResponseProduct getProductDetail(@PathVariable String id)
    {
        ResponseProduct responseProduct = new ResponseProduct();
        responseProduct.setId(1);
        responseProduct.setName("Balance Trainning Bicycle");
//        ResponseProduct responseProduct = new ResponseProduct();
//        responseProduct.id = 1;
//        responseProduct.name = "product1";
//        responseProduct.price = 100.00;
//        responseProduct.brand = "Adda";
//        responseProductList.add(responseProduct);

        return responseProduct;
    }
}

