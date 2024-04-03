package com.npci.productmanagement.service;

import com.npci.productmanagement.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    public Product addProduct(Product product);
    public List<Product> getProducts();
    public Map<String, Object> generateBills();

    boolean deleteProductById(String productId);

}
