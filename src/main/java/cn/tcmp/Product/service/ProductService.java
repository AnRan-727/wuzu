package cn.tcmp.Product.service;

import cn.tcmp.entity.*;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductService {
    //查询所有附件信息
    List<Attached_table> queryAllFuJian(String AttachmentName);
    //查询附件信息详情
    Attached_table detailFuJian(Integer AttachedID);
    //修改附件
    Integer updateFuJian(Attached_table Attached_table);
    //删除附件
    Integer deleteFuJian(Integer AttachedID);
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
}
