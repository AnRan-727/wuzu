package cn.tcmp.Channel.service;

import cn.tcmp.entity.Channel_Type;
import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Company_departments_list;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface Channel_Type_Service {
    //查询所有的渠道类型
    List<Channel_Type> queryAllChannelType();

    //模糊查询渠道
    PageInfo<Channel_list> queryAllChannelList(Channel_list channel_list,Integer pageNumber,Integer pageSize);

    //查询单个渠道的详情信息
    Channel_list queryDetailChannelList(Integer id);

    //查询该渠道(公司)下的部门
    List<Company_departments_list> queryCompany(Integer id);
}
