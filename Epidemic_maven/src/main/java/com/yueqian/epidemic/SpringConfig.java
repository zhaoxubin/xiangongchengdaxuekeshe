package com.yueqian.epidemic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//spring框架的配置类
@Configuration//表示当前类是配置类
//让组件扫描器不要扫描Controller的类(让Spring不要管理Controller)
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
@EnableTransactionManagement  //默认的事务管理器
public class SpringConfig {
@Bean //加在方法上，作用是将返回值纳入Spring容器的管理
 public PlatformTransactionManager transactionManager(DataSource dataSource){
     DataSourceTransactionManager dstm = new DataSourceTransactionManager();
     dstm.setDataSource(dataSource);
     return dstm;
 }

}
