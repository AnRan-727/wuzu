package cn.tcmp.Product.mapper;

import cn.tcmp.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    //查询所有附件信息
    List<Attached_table> queryAllFuJian(@Param("AttachmentName") String AttachmentName);
    //查询附件信息详情
    Attached_table detailFuJian(@Param("AttachedID")Integer AttachedID);
    //修改附件
    Integer updateFuJian(Attached_table Attached_table);
    //删除附件
    Integer deleteFuJian(@Param("AttachedID")Integer AttachedID);

    //查询全部产品
    List<Product_list> queryAll(Product_list product_list);
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