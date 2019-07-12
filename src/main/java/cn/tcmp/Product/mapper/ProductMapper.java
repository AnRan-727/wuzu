package cn.tcmp.Product.mapper;

import cn.tcmp.entity.Product_list;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface ProductMapper {
    //查询全部产品
    List<Product_list> queryAll(Product_list product_list);
    //新增按钮
    Insert addProduct(Product_list product_list);
}