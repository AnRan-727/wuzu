package cn.tcmp.Net_Worth.service;

import cn.tcmp.entity.Income_type_statement;
import cn.tcmp.entity.Net_value_table;
import cn.tcmp.entity.Product_list;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface JingZhiService {
    //根据条件查询
    List<Net_value_table> queryNetValue( Net_value_table n);
    //分页查询
    PageInfo<Net_value_table> queryNetValuePage(Net_value_table n,Integer pageNum,Integer pageSize);
    //查询所有的收益类型信息
    List<Income_type_statement> queryAllSy();
    //删除净值信息
    Integer deteleJingZhi(Integer NetWorthID);
    //根据净值id参看详情
    Net_value_table detailJingzhi(Integer NetWorthID);
    //根据净值id修改净值型净值信息
    Integer updateNvtJIngzhi(Net_value_table n);
    //根据净值id修改浮动型净值信息
    Integer updateNvtFudong(Net_value_table n);
    //根据净值id修改现金管理型型净值信息
    Integer updateNvtXianjin(Net_value_table n);
    //新建净值信息
    Integer addJingzhi(Net_value_table n);

    //产品查询
    List<Product_list> queryAllPL();
    //根据所选的产品id查询产品代码和收益类型
    Product_list queryCpByProductID( Integer ProductID);
}
