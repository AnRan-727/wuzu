package cn.tcmp.Product.mapper;

import cn.tcmp.entity.Net_value_table;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NetValueMapper {
    @Select("SELECT * FROM `net_value_table`")
    List<Net_value_table> queryAll();
}
