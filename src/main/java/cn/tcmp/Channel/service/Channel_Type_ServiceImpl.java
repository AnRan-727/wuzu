package cn.tcmp.Channel.service;

import cn.tcmp.Channel.mapper.Channel_Type_Mapper;
import cn.tcmp.entity.Channel_Type;
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
}
