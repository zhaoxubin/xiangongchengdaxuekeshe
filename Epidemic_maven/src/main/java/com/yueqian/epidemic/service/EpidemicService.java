package com.yueqian.epidemic.service;

import com.yueqian.epidemic.bean.DailyEpidemicInfo;
import com.yueqian.epidemic.bean.EpidemicDetailInfo;
import com.yueqian.epidemic.bean.ProvinceInfo;

import java.util.List;

public interface EpidemicService {
    public List<ProvinceInfo> saveEpidemicinfos(Integer userId, DailyEpidemicInfo dailyEpidemicInfo);
    public List<EpidemicDetailInfo> findEpidemicDetailInfoTotal();
}
