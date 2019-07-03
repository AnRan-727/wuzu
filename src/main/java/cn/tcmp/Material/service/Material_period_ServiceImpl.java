package cn.tcmp.Material.service;

import cn.tcmp.Material.mapper.Material_period_Mapper;
import cn.tcmp.entity.Material_period;
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
public class Material_period_ServiceImpl implements Material_period_Service {

    @Resource
    private Material_period_Mapper material_period_mapper;


    @Override
    public PageInfo<Material_period> queryAllMaterial_period(Material_period material_period,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Material_period> list = material_period_mapper.queryAllMaterial_period(material_period);
        PageInfo<Material_period> pageInfo = new PageInfo<Material_period>(list);
        return pageInfo;
    }

    @Override
    public Material_period queryMaterial_periodById(int id) {
        return material_period_mapper.queryMaterial_periodById(id);
    }

    @Override
    public int updateMaterial_period(Material_period material_period) {
        return material_period_mapper.updateMaterial_period(material_period);
    }

    @Override
    public int addMaterial_period(Material_period material_period) {
        return material_period_mapper.addMaterial_period(material_period);
    }
}
