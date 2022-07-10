package com.shadowplusing.file_pass.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 资源映射路径
 * api也就是接口访问路径： 比如http:://localhost:8081/image_api/img1.png
 * 映射到本地真实文件路径： 比如E:/Idea Projects/file_pass/static/images/upload/img1.png
 * 获取文件本地真实路径两种写法可以在 test 找到，运行一下即可看到结果
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    String path = System.getProperty("user.dir") + "\\static\\images\\upload\\";


    //其实这里只是对get方式起作用，我们先post上传文件到我们写好的路径，然后get访问api时就映射到我们存储时写好的路径去取文件
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/downloadFile_api/**").addResourceLocations("file:" + path);
    }

}
