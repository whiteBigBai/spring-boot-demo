package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.entity.ScProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bailiang
 */
@Repository
@Mapper
public interface ScProductMapper {
    /**
     * 查询所有数据
     *
     * @return
     */
    List<ScProduct> selectAll();
}
