package org.example.springboot.service;

import org.example.springboot.entity.ScProduct;

import java.util.List;

/**
 * @author bailiang
 */
public interface ScProductService {
    List<ScProduct> selectAll();
}
