package com.yueqian.epidemic.service;

import com.yueqian.epidemic.bean.ProvinceInfo;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface ProvinceService {
    List<ProvinceInfo> noDataProvinceList(String date);
}
