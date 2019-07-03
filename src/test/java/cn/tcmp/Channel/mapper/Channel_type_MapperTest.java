package cn.tcmp.Channel.mapper;

import cn.tcmp.Channel.service.Channel_Type_Service;
import cn.tcmp.Material.service.Material_period_Service;
import cn.tcmp.entity.Material_period;
import cn.tcmp.entity.Push_direction_table;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Channel_type_MapperTest {

    @Resource
    private Channel_Type_Service channelTypeService;
    @Resource
    private Material_period_Service material_period_service;
    @Test
    public void testaaa(){
        Material_period material_period = new Material_period();
        material_period.setIsNotPush(0);
        material_period.setMaterialPeriodName("还阿萨德");
        material_period.setNoteDescription("这是一条测试的数据");
        Push_direction_table push_direction_table = new Push_direction_table();
        push_direction_table.setPushDirectionID(1);
        material_period.setPushDirectionID(push_direction_table);
        System.out.println(material_period_service.addMaterial_period(material_period));
    }


    @Test
    public void testbbb(){
        Material_period material_period = new Material_period();
        //material_period.setMaterialPeriodName("阿");
        System.out.println(material_period_service.queryAllMaterial_period(material_period,1,5));
    }

    @Test
    public void queryAllChannel_type() {
        System.out.println(channelTypeService.queryAllChannelType());
    }
}