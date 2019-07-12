package cn.tcmp.Material.service;

import cn.tcmp.entity.Material_period;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface Material_period_Service {

    //按材料时期名称和操作时间模糊查询所有的材料时期
    PageInfo<Material_period> queryAllMaterial_period(Material_period material_period,Integer pageNum,Integer pageSize);
    //查询单条的材料时期
    Material_period queryMaterial_periodById(int id);
    //修改材料时期
    int updateMaterial_period(Material_period material_period);
    //增加材料时期
    int addMaterial_period(Material_period material_period);
    //删除材料时期
    int deleteMaterial_period(Integer id);
}
