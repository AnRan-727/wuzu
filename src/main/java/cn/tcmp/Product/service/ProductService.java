package cn.tcmp.Product.service;

import cn.tcmp.entity.Product_list;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface ProductService {
    //查询产品
    PageInfo<Product_list> queryAll(Product_list product_list, Integer pageNum,Integer pageSize);

    //新增按钮
    Insert addProduct(Product_list product_list);
}
