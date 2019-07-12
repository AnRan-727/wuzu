package cn.tcmp.Project.mapper;

import cn.tcmp.entity.Product_list;

import java.util.List;

public interface ProjectMapper {
    List<Product_list> queryAll(Product_list product_list);
}
