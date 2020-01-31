package com.tcrb.shoppingcart.product;

import com.tcrb.shoppingcart.queue.RedisMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RedisMessagePublisher redisMessagePublisher;

    @GetMapping("/api/v1/products")
    public List<ResponseProduct> getProductList(
            @RequestParam("age_id") Integer ageId,
            @RequestParam("gender_id") Integer genderId) {
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
    public ResponseProduct getProductDetail(@PathVariable String id) {
//        ResponseProduct responseProduct = new ResponseProduct();
//        responseProduct.setId(1);
//        responseProduct.setName("Balance Trainning Bicycle");
//        ResponseProduct responseProduct = new ResponseProduct();
//        responseProduct.id = 1;
//        responseProduct.name = "product1";
//        responseProduct.price = 100.00;
//        responseProduct.brand = "Adda";
//        responseProductList.add(responseProduct);

        Optional<Product> product = productRepository.findById(Integer.parseInt(id));
        ResponseProduct responseProduct = new ResponseProduct();
        responseProduct.setId(product.get().getId());
        responseProduct.setName(product.get().getToyName());

        return responseProduct;
    }

    @GetMapping("/api/v1/new")
    public ResponseProduct create() {
        Product product = new Product();
        product.setToyName("Sample");
        productRepository.save(product);

        ResponseProduct responseProduct = new ResponseProduct();
        responseProduct.setId(product.getId());
        responseProduct.setName(product.getToyName());
        return responseProduct;
    }

    @GetMapping("/api/v1/pubsub")
    public ResponseProduct createWithPubSub() {

        // Publish to queue
        String message = "Save request " + UUID.randomUUID();
        redisMessagePublisher.publish(message);

        ResponseProduct responseProduct = new ResponseProduct();
        responseProduct.setId(-1);
        responseProduct.setName("Waiting");
        return responseProduct;
    }
}

