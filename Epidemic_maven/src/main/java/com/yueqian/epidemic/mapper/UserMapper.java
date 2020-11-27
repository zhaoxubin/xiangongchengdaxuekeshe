package com.yueqian.epidemic.mapper;

import com.yueqian.epidemic.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {
  //  @Select(value = {"",""})
  @Select("select * from users where account=#{account} and PASSWORD=#{password}")
    UserInfo login(UserInfo userInfo);

}
