package com.yueqian.epidemic;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//mybatis的配置类
@Configuration
@MapperScan(basePackages = "com.yueqian.epidemic.mapper")
public class MybatisConfig {
    @Bean
  public BasicDataSource basicDataSource(){
      BasicDataSource dataSource = new BasicDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/epidemic");
      dataSource.setUsername("root");
      dataSource.setPassword("1234");

      //配置连接池的相关参数
      dataSource.setInitialSize(3);
      dataSource.setMaxActive(10);
      dataSource.setMaxIdle(1);
      dataSource.setMaxWait(4000);
      dataSource.setDefaultAutoCommit(false);
      return dataSource;
  }
  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource){
      SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
      factoryBean.setDataSource(dataSource);
      factoryBean.setTypeAliasesPackage("com.yueqian.epidemic.bean");
      org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
      configuration.setMapUnderscoreToCamelCase(true);
      factoryBean.setConfiguration(configuration);
      SqlSessionFactory sessionFactory = null;
      try {
          sessionFactory = factoryBean.getObject();
      } catch (Exception e) {
          e.printStackTrace();
      }
      return sessionFactory;
  }
}
