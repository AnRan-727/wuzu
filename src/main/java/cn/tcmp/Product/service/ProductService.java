package cn.tcmp.Product.service;

import cn.tcmp.entity.*;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductService {
    //查询产品
    PageInfo<Product_list> queryAll(Product_list product_list, Integer pageNum,Integer pageSize);

    //新增按钮
    Integer addProduct(Product_list product_list);

    //查询收益类型下拉框
    List<Item_type_table> queryXiaLaKuang();

    //查询产品分类下拉框
    List<Product_classification_table> queryChanPinXiaLaKuang();

    //收益类型下拉框
    List<Income_type_statement> ShouYiLeiXing();

    //产品投向下拉框
    List<Product_investment> TouXiangXiaLaKuang();



    //查询一条产品信息
    Product_list detailProduct(Integer Productid);


    //修改产品信息
    Integer updateProduct(Product_list product_list);


    //删除产品信息
    Integer deleteProduct(Integer id);

    //查询最大的产品代码
    Product_list queryMaxProductCode();

    //查询一个产品下的附件
    List<Product_Accessories> queryAllProductAccessories(Product_Accessories productAccessories);
    //新建附件
    int addProductAccessories(Product_Accessories productAccessories);
    //查询附件详情
    Product_Accessories detailProductAccessories(Integer id);
    //修改附件
    int updateProductAccessories(Product_Accessories productAccessories);
    //删除附件
    int deleteProductAccessories(Integer id);
}
