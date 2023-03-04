package org.example.springboot.controller;

import org.example.springboot.common.Result;
import org.example.springboot.entity.Product;
import org.example.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bailiang
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/queryAllProduct")
    public Result queryAllProduct() {
        System.out.println(productService.selectAll());
        List<Product> products = productService.selectAll();
        return new Result(200, "查询成功", products);
    }
}
