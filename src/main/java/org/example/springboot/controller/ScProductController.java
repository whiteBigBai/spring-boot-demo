package org.example.springboot.controller;

import org.example.springboot.entity.ScProduct;
import org.example.springboot.service.ScProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bailiang
 */
@RestController
@RequestMapping("/scProduct")
public class ScProductController {
    @Autowired
    ScProductService scProductService;

    @RequestMapping("/queryAllProduct")
    public List<ScProduct> queryAllProduct() {
        System.out.println(scProductService.selectAll());
        return scProductService.selectAll();
    }
}
