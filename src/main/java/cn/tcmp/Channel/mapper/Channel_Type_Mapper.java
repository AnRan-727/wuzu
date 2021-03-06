package cn.tcmp.Channel.mapper;

import cn.tcmp.entity.Channel_Type;
import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Company_departments_list;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface Channel_Type_Mapper {
    //查询所有的渠道类型
    List<Channel_Type> queryAllChannelType();

    //模糊查询渠道
    List<Channel_list> queryAllChannelList(Channel_list channel_list);

    //查询单个渠道的详情信息
    Channel_list queryDetailChannelList(Integer id);

    //查询该渠道(公司)下的部门
    List<Company_departments_list> queryCompany(Integer id);

    //查询单个部门信息
    Company_departments_list queryCompanyById(Integer id);

    //新建渠道&公司
    int addChannel(Channel_list channel_list);

    //新增部门信息
    int addCompanyDepartmentsList(Company_departments_list company_departments_list);

    //修改渠道&公司
    int updateChannel(Channel_list channel_list);

    //修改部门信息
    int updateCompany(Company_departments_list company_departments_list);

    //删除渠道公司
    int deleteChannel(Integer id);

    //删除公司部门
    int deleteCompany(Integer id);

}
