package cn.tcmp.Channel.service;

import cn.tcmp.Channel.mapper.Channel_Type_Mapper;
import cn.tcmp.entity.Channel_Type;
import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Company_departments_list;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
@Service
public class Channel_Type_ServiceImpl implements Channel_Type_Service {
    @Resource
    private Channel_Type_Mapper channelTypeMapper;


    //查询所有的渠道类型
    @Override
    public List<Channel_Type> queryAllChannelType() {
        return channelTypeMapper.queryAllChannelType();
    }

    //模糊查询渠道
    @Override
    public PageInfo<Channel_list> queryAllChannelList(Channel_list channel_list, Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Channel_list> list = channelTypeMapper.queryAllChannelList(channel_list);
        return new PageInfo<>(list);
    }

    @Override
    public Channel_list queryDetailChannelList(Integer id) {
        return channelTypeMapper.queryDetailChannelList(id);
    }

    @Override
    public List<Company_departments_list> queryCompany(Integer id) {
        return channelTypeMapper.queryCompany(id);
    }

    @Override
    public Company_departments_list queryCompanyById(Integer id) {
        return channelTypeMapper.queryCompanyById(id);
    }

    @Override
    public int addChannel(Channel_list channel_list) {
        return channelTypeMapper.addChannel(channel_list);
    }

    @Override
    public int addCompanyDepartmentsList(Company_departments_list company_departments_list) {
        return channelTypeMapper.addCompanyDepartmentsList(company_departments_list);
    }

    @Override
    public int updateChannel(Channel_list channel_list) {
        return channelTypeMapper.updateChannel(channel_list);
    }

    @Override
    public int updateCompany(Company_departments_list company_departments_list) {
        return channelTypeMapper.updateCompany(company_departments_list);
    }

    @Override
    public int deleteChannel(Integer id) {
        return channelTypeMapper.deleteChannel(id);
    }

    @Override
    public int deleteCompany(Integer id) {
        return channelTypeMapper.deleteCompany(id);
    }
}
