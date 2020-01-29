package com.tcrb.shoppingcart.product;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    ResponseProduct stubproduct;

    @Test
    void getProductList() {
        ResponseProduct result
                = restTemplate.getForObject("/api/v1/products", ResponseProduct.class);

        assertEquals(0,result.getId());
    }

    @Test
    void getProductByDetail() {
        stubproduct.setId(1);
        stubproduct.setName("Balance Trainning Bicycle");

        ResponseProduct result
                = restTemplate.getForObject("/api/v1/products/1", ResponseProduct.class);
        assertEquals(1,result.getId());
        assertEquals("Balance Trainning Bicycle",result.getName());
    }


}