package cn.tcmp.Channel.controller;

import cn.tcmp.Channel.service.Channel_Type_Service;
import cn.tcmp.entity.Attached_table;
import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Company_departments_list;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/9
 */
@Controller
@RequestMapping(value = "channelType")
public class Channel_Type_Controller {
    @Autowired
    private Channel_Type_Service channel_type_service;


    //模糊查询所有的渠道公司
    @RequestMapping(value = "toQueryChannelType")
    public String toQueryChannelType(Channel_list channel_list, Integer pageNumber, Model model){
        if(pageNumber == null){
            pageNumber = 1;
        }

        PageInfo<Channel_list> pageInfo = channel_type_service.queryAllChannelList(channel_list,pageNumber,5);
        System.out.println("渠道是=========>"+pageInfo.getList());

        model.addAttribute("chlist",channel_list);
        model.addAttribute("channel",pageInfo);
        model.addAttribute("type",channel_type_service.queryAllChannelType());

        return "QuDaoGuanLi/QuDaoChaXun";
    }

    //去渠道公司详情页面
    @RequestMapping(value = "toDetailChannel")
    public String toDetailChannel(Integer id ,Model model){

        model.addAttribute("company",channel_type_service.queryCompany(id));
        model.addAttribute("list",channel_type_service.queryDetailChannelList(id));

        return "QuDaoGuanLi/XiangQing/QuDaoXiangQing";
    }


    //去新增渠道公司页面
    @RequestMapping(value = "toAddChannel")
    public String toAddChannel(Model model){
        model.addAttribute("type",channel_type_service.queryAllChannelType());
        return "QuDaoGuanLi/XinJian/QuDaoXinJian";
    }

    //新增公司渠道信息
    @RequestMapping(value = "doAddChannel")
    @ResponseBody
    public Integer doAddChannel(Channel_list channel_list){
        channel_type_service.addChannel(channel_list);
        return channel_list.getChannelID();
    }

    //新增公司部门信息
    @RequestMapping(value = "doAddCompany")
    public String doAddCompany(Company_departments_list company_departments_list){
        System.out.println("=====>公司部门信息:"+company_departments_list);
        channel_type_service.addCompanyDepartmentsList(company_departments_list);
        return "redirect:toQueryChannelType";
    }


























    /*private static List<String> filename = new ArrayList<>();
    private String path="images";//要保存的文件夹的名字,需修改
    @RequestMapping(value="fileController",produces = "text/html;charset=UTF-8")//解决返回中文乱码
    @ResponseBody//设置ajax 返回保存路径
    public String fileController(MultipartFile file,HttpServletRequest request,HttpServletResponse response) {
        response.setCharacterEncoding("utf-8");
        //寻找要保存的文件夹(保存路径)
        String savePath = request.getSession().getServletContext().getRealPath("/"+path+"/");
        try {
            file.transferTo(new File(savePath+"/"+file.getOriginalFilename()));
            //在"/"后面可以自行拼接name或加入随机数(以免不同用户上传替换)
        } catch (Exception e) {
            e.printStackTrace();
        }
        Attached_table attached_table = new Attached_table();

        String url = file.getOriginalFilename();
        attached_table.setAttachmentPath(url);
        filename.add(url);


        return "/"+path+"/"+url;
    }
*/






}
