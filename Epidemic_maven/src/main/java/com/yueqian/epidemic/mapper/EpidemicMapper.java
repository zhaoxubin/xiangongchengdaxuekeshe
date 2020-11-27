package com.yueqian.epidemic.mapper;

import com.yueqian.epidemic.bean.EpidemicDetailInfo;
import com.yueqian.epidemic.bean.EpidemicInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpidemicMapper {
    @Insert("INSERT INTO epidemics (province_id,data_year,data_month,data_day,affirmed,suspected,isolated,dead,cured,user_id,input_date)\n" +
            "VALUES (#{provinceId},#{dataYear},#{dataMonth},#{dataDay},#{affirmed},#{suspected},#{isolated},#{dead},#{cured},#{userId},#{inputDate});")
    void saveEpidemicInfos(EpidemicInfo epidemicInfo);
    @Select("SELECT \n" +
            "        ep.province_id,\n" +
            "        temp.province_name,\n" +
            "        ep.data_year,\n" +
            "        ep.data_month,\n" +
            "        ep.data_day,\n" +
            "        temp.affirmed_total,\n" +
            "        temp.suspected_total,\n" +
            "        temp.isolated_total,\n" +
            "        temp.dead_total,\n" +
            "        temp.cured_total \n" +
            "      FROM\n" +
            "        epidemics ep \n" +
            "        RIGHT OUTER JOIN \n" +
            "          (SELECT \n" +
            "            e.province_id,\n" +
            "            p.province_name,\n" +
            "            SUM(affirmed) affirmed_total,\n" +
            "            SUM(suspected) suspected_total,\n" +
            "            SUM(isolated) isolated_total,\n" +
            "            SUM(dead) dead_total,\n" +
            "            SUM(cured) cured_total \n" +
            "          FROM\n" +
            "            epidemics e \n" +
            "            RIGHT \n" +
            "            OUTER JOIN provinces p \n" +
            "              ON e.province_id = p.province_id \n" +
            "          GROUP BY e.province_id,\n" +
            "            p.province_name) temp \n" +
            "          ON ep.province_id = temp.province_id \n" +
            "      WHERE ep.data_year = #{arg0} \n" +
            "        AND ep.data_month = #{arg1}\n" +
            "        AND ep.data_day = #{arg2}")
    List<EpidemicDetailInfo> findEpidemicDetailInfoTotal(int year, int month, int day);
}
