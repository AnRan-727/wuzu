package cn.tcmp.entity.VO;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/16
 */
@Data
public class ChanPinJingZhi {

    //产品净值
    private Integer ProductID;
    //估值范围 时间范围 开始时间 结束时间  成立批次
    private String guZhi,dateTime,startTime,endTime,piCi;

}
