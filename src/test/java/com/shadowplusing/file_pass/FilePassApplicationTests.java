package com.shadowplusing.file_pass;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

@SpringBootTest
class FilePassApplicationTests {

    void pathOne(){
        //获取跟目录
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(!path.exists()) path = new File("");
        System.out.println("path: " + path.getAbsolutePath());

        //如果上传目录为/static/images/upload/，则可以如下获取：
        File upload = new File(path.getAbsolutePath(),"static/images/upload/");
        if(!upload.exists()) upload.mkdirs();
        System.out.println("upload url: "+upload.getAbsolutePath());

        //在开发测试模式时，得到的地址为：{项目跟目录}/static/images/upload
        //在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/images/upload
    }

    void pathTwo(){
        System.out.println("pathTwo: " + System.getProperty("user.dir") + "\\static\\images\\upload");
    }

    @Test
    void contextLoads() {
        pathOne();
        pathTwo();
    }

}
