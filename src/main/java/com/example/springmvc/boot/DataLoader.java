package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product();
        product1.setName("Kitkat");
        product1.setDescription("Crunchy Choclaty");
        product1.setType("Candies");
        product1.setCategory("Bars");
        product1.setPrice(20.00);

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Dairy Milk");
        product2.setDescription("Full of chocolate");
        product2.setType("Candies");
        product2.setCategory("Bars");
        product2.setPrice(40.00);

        productRepository.save(product2);

    }
}
