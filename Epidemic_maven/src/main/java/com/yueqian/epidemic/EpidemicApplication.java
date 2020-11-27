package com.yueqian.epidemic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//相当于web.xml文件，是注解方式的一种配置
public class EpidemicApplication extends AbstractAnnotationConfigDispatcherServletInitializer {

   //引入spring配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        /*
        * 数组有静态和动态
        * */
        return new Class[]{SpringConfig.class};
    }
//引入SpringMVC的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }
//配置拦截器的拦截规则
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
