package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRep;

    @Override
    public List<Product> getAllProducts() {
        return this.productRep.getAllProducts();
    }

    @Override
    public Product getProductById(String productId) {
        return this.productRep.getProductById(productId);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRep.getProductsByCategory(category);
    }

}
