package org.example.springboot.service;

import org.example.springboot.entity.Product;

import java.util.List;

/**
 * @author bailiang
 */
public interface ProductService {
    List<Product> selectAll();
}
