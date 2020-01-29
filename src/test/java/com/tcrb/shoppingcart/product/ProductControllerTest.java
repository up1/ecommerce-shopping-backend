package com.tcrb.shoppingcart.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void getProductList() {
        ResponseProduct result
                = restTemplate.getForObject("/api/v1/products", ResponseProduct.class);

        assertEquals(0,result.getId());
    }

}