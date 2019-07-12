package cn.tcmp.Product.service;

import cn.tcmp.Product.mapper.NetValueMapper;
import cn.tcmp.entity.Net_value_table;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NetValueServiceImpl implements NetValueService {
    @Resource
    private NetValueMapper mapper;
    @Override
    public List<Net_value_table> queryAll() {
        return mapper.queryAll();
    }
}
