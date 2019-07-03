package cn.tcmp.Material.mapper;

import cn.tcmp.entity.Material_period;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface Material_period_Mapper {

    //按材料时期名称和操作时间模糊查询所有的材料时期
    List<Material_period> queryAllMaterial_period(Material_period material_period);
    //查询单条的材料时期
    Material_period queryMaterial_periodById(int id);
    //修改材料时期
    int updateMaterial_period(Material_period material_period);
    //增加材料时期
    int addMaterial_period(Material_period material_period);

}
