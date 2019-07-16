package cn.tcmp.entity;

import lombok.Data;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/15
 */
//产品附件表
@Data
public class Product_Accessories {

    //附件ID
    private Integer productAccessoriesID;
    //文件名称  文档类型    附件说明   创建人
    private String productAccessoriesName, documentType,productAccessoriesExplain,founder;
    //上传时间
    private Date uploadDate;
    //文件大小
    private String documentSize;
    //产品ID
    private Product_list product_list;
    //产品附件路径
    private String productAccessoriesPath;
    //起始时间
    private String startTime,endTime;


}
