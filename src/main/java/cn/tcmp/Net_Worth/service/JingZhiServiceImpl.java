package cn.tcmp.Net_Worth.service;

import cn.tcmp.Net_Worth.mapper.JingzhiMapper;
import cn.tcmp.entity.Income_type_statement;
import cn.tcmp.entity.Net_value_table;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JingZhiServiceImpl implements JingZhiService {
    @Autowired
    private JingzhiMapper mapper;

    @Override
    public List<Net_value_table> queryNetValue(Net_value_table n) {
        return mapper.queryNetValue(n);
    }

    @Override
    public PageInfo<Net_value_table> queryNetValuePage(Net_value_table n, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageNum);
        List<Net_value_table> list=mapper.queryNetValue(n);
        PageInfo<Net_value_table> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Income_type_statement> queryAllSy() {
        return mapper.queryAllSy();
    }

    @Override
    public Integer deteleJingZhi(Integer NetWorthID) {
        return mapper.deteleJingZhi(NetWorthID);
    }
}
