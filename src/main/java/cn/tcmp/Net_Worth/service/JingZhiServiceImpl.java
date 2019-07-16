package cn.tcmp.Net_Worth.service;

import cn.tcmp.Net_Worth.mapper.JingzhiMapper;
import cn.tcmp.entity.Income_type_statement;
import cn.tcmp.entity.Net_value_table;
import cn.tcmp.entity.Product_list;
import cn.tcmp.entity.VO.ChanPinJingZhi;
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
        PageHelper.startPage(pageNum,pageSize);
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

    @Override
    public Net_value_table detailJingzhi(Integer NetWorthID) {
        return mapper.detailJingzhi(NetWorthID);
    }

    @Override
    public Integer updateNvtJIngzhi(Net_value_table n) {
        return mapper.updateNvtJIngzhi(n);
    }

    @Override
    public Integer updateNvtFudong(Net_value_table n) {
        return mapper.updateNvtFudong(n);
    }

    @Override
    public Integer updateNvtXianjin(Net_value_table n) {
        return mapper.updateNvtXianjin(n);
    }

    @Override
    public Integer addJingzhi(Net_value_table n) {
        return mapper.addJingzhi(n);
    }

    @Override
    public List<Product_list> queryAllPL() {
        return mapper.queryAllPL();
    }

    @Override
    public Product_list queryCpByProductID(Integer ProductID) {
        return mapper.queryCpByProductID(ProductID);
    }

    @Override
    public List<Net_value_table> queryChanPinJingZhi(ChanPinJingZhi chanPinJingZhi) {
        return mapper.queryChanPinJingZhi(chanPinJingZhi);
    }
}
