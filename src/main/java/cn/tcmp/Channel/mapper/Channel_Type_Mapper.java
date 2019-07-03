package cn.tcmp.Channel.mapper;

import cn.tcmp.entity.Channel_Type;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface Channel_Type_Mapper {
    //查询所有的渠道类型
    List<Channel_Type> queryAllChannelType();

}
