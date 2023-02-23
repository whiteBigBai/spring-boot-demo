package org.example.springboot.service.impl;

import org.example.springboot.entity.ScProduct;
import org.example.springboot.mapper.ScProductMapper;
import org.example.springboot.service.ScProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bailiang
 */
@Service
public class ScProductServiceImpl implements ScProductService {
    @Autowired
    ScProductMapper scProductMapper;

    @Override
    public List<ScProduct> selectAll() {
        return scProductMapper.selectAll();
    }
}
