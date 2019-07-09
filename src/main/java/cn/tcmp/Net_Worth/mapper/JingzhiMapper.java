package cn.tcmp.Net_Worth.mapper;

import cn.tcmp.entity.Income_type_statement;
import cn.tcmp.entity.Net_value_table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}
