package com.tcrb.shoppingcart.queue;

import com.tcrb.shoppingcart.product.Product;
import com.tcrb.shoppingcart.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RedisMessageSubscriber implements MessageListener {

//    public static List<String> messageList = new ArrayList<>();

    private ProductRepository productRepository;

    public RedisMessageSubscriber(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void onMessage(final Message message, final byte[] pattern) {
//        messageList.add(message.toString());
        System.out.println("Message received: " + new String(message.getBody()));

        // Save new product
        Product product = new Product();
        product.setToyName("Sample");
        productRepository.save(product);

    }
}
