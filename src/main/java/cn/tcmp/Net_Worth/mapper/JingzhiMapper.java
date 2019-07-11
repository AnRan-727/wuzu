package cn.tcmp.Net_Worth.mapper;

import cn.tcmp.entity.Income_type_statement;
import cn.tcmp.entity.Net_value_table;
import cn.tcmp.entity.Product_list;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface JingzhiMapper {

    //根据条件查询
    List<Net_value_table> queryNetValue(@Param("nn") Net_value_table n);

    //查询收益类型信息
    @Select(value = "select * from Income_type_statement")
    List<Income_type_statement> queryAllSy();


    //删除净值信息
    @Delete(value = "delete from net_value_table where NetWorthID=#{NetWorthID}")
    Integer deteleJingZhi(@Param("NetWorthID") Integer NetWorthID);

    //根据净值id参看详情
    Net_value_table detailJingzhi(@Param("NetWorthID") Integer NetWorthID);

    //根据净值id修改净值型净值信息
    @Update(value = "update Net_value_table set NetWorth=#{NetWorth},CumulativeNetWorth=#{CumulativeNetWorth},OperatingDate=NOW() where NetWorthID=#{NetWorthID}")
    Integer updateNvtJIngzhi(Net_value_table n);
    //根据净值id修改浮动型净值信息
    @Update(value = "update Net_value_table set NetWorth=#{NetWorth},CumulativeNetWorth=#{CumulativeNetWorth},OperatingDate=NOW() where NetWorthID=#{NetWorthID}")
    Integer updateNvtFudong(Net_value_table n);
    //根据净值id修改现金管理型型净值信息
    @Update(value = "update Net_value_table set ExtremelyProfitable=#{ExtremelyProfitable},RateOfReturn=#{RateOfReturn},OperatingDate=NOW() where NetWorthID=#{NetWorthID}")
    Integer updateNvtXianjin(Net_value_table n);


    //新建净值信息
    Integer addJingzhi(Net_value_table n);

    //产品查询
    List<Product_list> queryAllPL();

    //根据所选的产品id查询产品代码和收益类型
    Product_list queryCpByProductID(@Param("ProductID") Integer ProductID);

}
