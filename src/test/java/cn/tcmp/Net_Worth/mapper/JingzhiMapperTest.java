package cn.tcmp.Net_Worth.mapper;

import cn.tcmp.entity.Net_value_table;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JingzhiMapperTest {

    @Autowired
    private JingzhiMapper mapper;
    @Test
    public void queryNetValue() {
        List<Net_value_table> list=mapper.queryNetValue(new Net_value_table());
        for (Net_value_table aa : list) {
            System.err.println(aa);
        }
    }
}