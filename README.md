# img_pass
 springboot 简单的文件传输学习。
 实现简单的图片上传和访问图片。
 主要是了解一下流程和方法。

测试用：
    由webstorm创建一个纯HTML，位置：HTML_by_WebStorm\file_pass.html

## thinking
   1. 搞了很久老是upload_api 404，最后选择尝试了thyme leaf，也不行，最终发现是@RestController注解木有加QWQ。
   2. 过程中遇到一个问题，/downloadFile_api映射到本地可以获取图片，/downloadFile_api/{filename}不可以获取图片。不知道怎么又可以用/downloadFile_api/img1.jpg获取图片情况下，又获取GET方法传递过来的img1.jpg参数
   3. 映射路径的获取有两种写法，可以在test中查看或者运行下test查看输出结果。

## reference
   1. [IDEA 设置代理](https://blog.csdn.net/qq_39052982/article/details/95938562)
   2. [SpringBoot 实现文件上传，图片上传并显示功能](https://blog.csdn.net/qq_38762237/article/details/81282444?spm=1001.2101.3001.6650.3&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-3-81282444-blog-116042813.pc_relevant_multi_platform_whitelistv1&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-3-81282444-blog-116042813.pc_relevant_multi_platform_whitelistv1&utm_relevant_index=6)
   3. [配置本地资源映射路径 addResourceHandlers](https://www.cnblogs.com/yblue/p/14663712.html)
   4. [Springboot获取文件路径(dev/jar)](https://blog.csdn.net/qq_20282955/article/details/89856223?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_title~default-0-89856223-blog-106026117.pc_relevant_aa&spm=1001.2101.3001.4242.1&utm_relevant_index=3)
   5. [@RequestParam用法及原理](https://cloud.tencent.com/developer/article/1904682)
   6. [SpringBoot项目的快速创建以及简单访问html网页](https://blog.csdn.net/weixin_39106990/article/details/105530443)