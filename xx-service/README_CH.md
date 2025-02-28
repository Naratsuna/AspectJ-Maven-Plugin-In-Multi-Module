你可以使用spring提供的aop方式去使用切面，这里不做示例

这里只演示在Spring管理的对象中如何使用被织入切面的工具类，这里需要在整个项目中进行compile后再启动starter【重要】，
如果不进行compile直接启动starter会不生效。
步骤：

1. 在控制台中输入mvn compile或者在IntelliJ IDEA的Maven面板中点击“compile”编译代码
2. 启动服务模块的Stater
3. 访问 http://127.0.0.1:8080/test/requestOtherApi
4. 查看控制台你会发现如下输出

```
Before AspectJ-Maven-Plugin-In-Multi-Module
Param is [ Mock Params ]
Result is [ Mock Result ]
After AspectJ-Maven-Plugin-In-Multi-Module
```



