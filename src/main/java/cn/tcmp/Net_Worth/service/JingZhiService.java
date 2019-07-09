package cn.tcmp.Net_Worth.service;

import cn.tcmp.entity.Income_type_statement;
import cn.tcmp.entity.Net_value_table;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

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
}
