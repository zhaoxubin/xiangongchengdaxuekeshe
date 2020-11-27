package com.yueqian.epidemic.controller;

import com.yueqian.epidemic.bean.*;
import com.yueqian.epidemic.service.EpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/epidemicData")
public class EpidemicController {
    @Autowired
    private EpidemicService epidemicService;
   @RequestMapping("/ajax/input")
   //@RequestBody 作用是页面提交的json格式的数据转换成对象
   @ResponseBody//将return的对象转换为json格式
    public AjaxResponseInfo saveEpidemicInfo(@RequestBody DailyEpidemicInfo dailyEpidemicInfo , HttpSession session){
      AjaxResponseInfo ajaxResponseInfo = new AjaxResponseInfo();
       UserInfo loginedUser = (UserInfo) session.getAttribute("loginedUser");
       System.out.println("saveEpidemicInfo啦啦啦"+dailyEpidemicInfo);
       //System.out.println("iddddd"+loginedUser.getUserId());
       if(loginedUser != null){
           //已经登陆了
           Integer userId = loginedUser.getUserId();
           List<ProvinceInfo> provinceInfos = epidemicService.saveEpidemicinfos(userId, dailyEpidemicInfo);
           ajaxResponseInfo.setCode(0);
           ajaxResponseInfo.setMsg("保存成功");
           ajaxResponseInfo.setData(provinceInfos);
       }else{
           //表示用户没有登录
           ajaxResponseInfo.setCode(-2);
           ajaxResponseInfo.setMsg("权限不足，请登陆后再试");
       }
       return ajaxResponseInfo;
   }
   @RequestMapping("/ajax/lastestData")
   @ResponseBody
   public AjaxResponseInfo findEpidemicDetailInfoTotal(){
       List<EpidemicDetailInfo> epidemicDetailInfoTotals = epidemicService.findEpidemicDetailInfoTotal();
       AjaxResponseInfo ajaxResponseInfo = new AjaxResponseInfo();
       ajaxResponseInfo.setCode(0);
       ajaxResponseInfo.setMsg("查询成功");
       ajaxResponseInfo.setData(epidemicDetailInfoTotals);
       return ajaxResponseInfo;
   }
}
