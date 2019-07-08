package cn.tcmp.Net_Worth.mapper;

import cn.tcmp.entity.Net_value_table;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JingzhiMapper {

    //根据条件查询
    List<Net_value_table> queryNetValue(@Param("nn") Net_value_table n);
}
