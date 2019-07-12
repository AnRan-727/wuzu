package cn.tcmp.Material.service;

import cn.tcmp.entity.Material_period;
import cn.tcmp.entity.Push_direction_table;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Material_period_ServiceImplTest {

    @Resource
    private Material_period_Service material_period_service;

    @Test
    public void addMaterial_period() {

        Material_period material_period = new Material_period();
        material_period.setMaterialPeriodName("撒大声地");
        Push_direction_table push_direction_table = new Push_direction_table();
        push_direction_table.setPushDirectionID(1);
        material_period.setPushDirectionID(push_direction_table);

        material_period.setNoteDescription("借款后就开始菲窘设计费考试的");
        material_period_service.addMaterial_period(material_period);
        System.out.println(material_period.getMaterialPeriodID());
        System.out.println();

    }
}