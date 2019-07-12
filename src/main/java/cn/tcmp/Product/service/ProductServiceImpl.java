package cn.tcmp.Product.service;

import cn.tcmp.Product.mapper.ProductMapper;
import cn.tcmp.entity.Product_list;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product_list> queryAll(Product_list product_list,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Product_list> list = productMapper.queryAll(product_list);
        PageInfo<Product_list> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Insert addProduct(Product_list product_list) {
        return productMapper.addProduct(product_list);
    }


}
