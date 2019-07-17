package cn.tcmp.Product.service;

import cn.tcmp.Product.mapper.ProductMapper;
import cn.tcmp.entity.*;
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
    public Integer addProduct(Product_list product_list) {
        return productMapper.addProduct(product_list);
    }

    @Override
    public List<Item_type_table> queryXiaLaKuang() {
        return productMapper.queryXiaLaKuang();
    }

    @Override
    public List<Product_classification_table> queryChanPinXiaLaKuang() {
        return productMapper.queryChanPinXiaLaKuang();
    }

    @Override
    public List<Income_type_statement> ShouYiLeiXing() {
        return productMapper.ShouYiLeiXing();
    }

    @Override
    public List<Product_investment> TouXiangXiaLaKuang() {
        return productMapper.TouXiangXiaLaKuang();
    }

    @Override
    public Product_list detailProduct(Integer Productid) {
        System.err.println("+++++++++++++"+productMapper.detailProduct(Productid));
        return productMapper.detailProduct(Productid);
    }

    @Override
    public Integer updateProduct(Product_list product_list) {
        return productMapper.updateProduct(product_list);
    }

    @Override
    public Integer deleteProduct(Integer id) {
        return productMapper.deleteProduct(id);
    }

    @Override
    public Product_list queryMaxProductCode() {
        return productMapper.queryMaxProductCode();
    }

    @Override
    public List<Product_Accessories> queryAllProductAccessories(Product_Accessories productAccessories) {
        return productMapper.queryAllProductAccessories(productAccessories);
    }

    @Override
    public int addProductAccessories(Product_Accessories productAccessories) {
        return productMapper.addProductAccessories(productAccessories);
    }

    @Override
    public Product_Accessories detailProductAccessories(Integer id) {
        return productMapper.detailProductAccessories(id);
    }

    @Override
    public int updateProductAccessories(Product_Accessories productAccessories) {
        return productMapper.updateProductAccessories(productAccessories);
    }

    @Override
    public int deleteProductAccessories(Integer id) {
        return productMapper.deleteProductAccessories(id);
    }


}
