## 参考文档
1. https://tech.meituan.com/2019/09/05/java-bytecode-enhancement.html
2. https://mp.weixin.qq.com/s/UeUHUc6bQYMFT_L_Rkd74w

## 编译打包步骤
1. 先在IDEA里运行Main函，在target目录中会生成编译好的.class文件
2. 在target/classes目录下分别创建MANIFEST_AGENT.MF和MANIFEST_APP.MF 内容见文件
3. 执行打包命令
     `jar -cvfm myAgent.jar MANIFEST_AGENT.MF agent`
     `jar -cvfm myApp.jar MANIFEST_APP.MF agent`
4. 测试结果
    `java -jar myApp.jar`
    `java -javaagent:myAgent.jar -jar myApp.jar`