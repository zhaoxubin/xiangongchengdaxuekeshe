package com.yueqian.epidemic;

import com.yueqian.epidemic.common.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
 // private DateConverter dateConverter = new DateConverter();
  @Autowired
    private DateConverter dateConverter;
   //url请求没有匹配到后台方法，就使用默认方法定位到一个静态页面
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();//给静态页面放行
    }
//添加视图控制器  ，设置默认静态资源访问路径
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("epidemic");
    }
//配置视图解析器
    //给视图添加前缀和后缀
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/",".jsp");
    }
//添加格式化规则
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(dateConverter);//将日期转换器的格式设置给框架
    }
}
