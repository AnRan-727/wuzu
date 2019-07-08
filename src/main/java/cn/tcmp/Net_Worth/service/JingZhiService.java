package cn.tcmp.Net_Worth.service;

import cn.tcmp.entity.Net_value_table;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JingZhiService {
    //根据条件查询
    List<Net_value_table> queryNetValue( Net_value_table n);
    PageInfo<Net_value_table> queryNetValuePage(Net_value_table n,Integer pageNum,Integer pageSize);
}
