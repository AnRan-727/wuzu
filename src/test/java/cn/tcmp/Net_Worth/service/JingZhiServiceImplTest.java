package cn.tcmp.Net_Worth.service;

import cn.tcmp.entity.Net_value_table;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JingZhiServiceImplTest {

    @Autowired
    private JingZhiService service;

    @Test
    public void queryNetValuePage() {

        Net_value_table net_value_table = new Net_value_table();

        PageInfo<Net_value_table> pageInfo = service.queryNetValuePage(net_value_table,1,5);

        for (Net_value_table netValueTable : pageInfo.getList()) {

            System.err.println(net_value_table);

        }

    }
}