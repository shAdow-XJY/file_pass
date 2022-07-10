package com.shadowplusing.file_pass.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileController {

    //get方法 + 路径URL上参数
    @GetMapping(value = "/downloadFile_api")
    public void DownLoadFile()
    {

    }

    //post方法 + 请求体的参数
    @PostMapping(value = "/uploadFile_api")
    public String UpLoadFile(@RequestParam(value = "file") MultipartFile file,
                            @RequestParam(value = "fileName",defaultValue = "img1") String fileName)
    {
        System.out.println(fileName);

        if(file.isEmpty()){
            System.out.println("file uploaded is null");
        }
        String originFileName = file.getOriginalFilename();  // 原本上传文件的文件名
        String suffixName = originFileName.substring(originFileName.lastIndexOf("."));  // 后缀名,比如 .png/.jpg 之类的

        String path = System.getProperty("user.dir") + "/static/images/upload/";
        String filePath = path + fileName + suffixName; // 上传后的路径 新文件名
        System.out.println(filePath);

        File dest = new File(filePath);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);     //上传的文件保存到des这个文件路径
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName + suffixName;
    }

}
