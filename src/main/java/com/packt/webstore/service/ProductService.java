package com.packt.webstore.service;

import com.packt.webstore.domain.Product;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(String productId);

    List<Product> getProductsByCategory(String category);
}

