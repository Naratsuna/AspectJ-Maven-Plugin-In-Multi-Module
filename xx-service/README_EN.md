You can use the AOP approach provided by Spring to use aspects, but no example will be provided here.

This demonstrates how to use the aspect-weaved utility classes in objects managed by Spring. It is important to compile the entire project before starting the starter, as starting the starter without compilation will not take effect.

Steps:

1. Enter "mvn compile" in the console, or click "compile" in the Maven panel of IntelliJ IDEA to compile the code.
2. Start the service module's Starter.
3. Access http://127.0.0.1:8080/test/requestOtherApi.
4. Check the console, and you will see the following output.

```
Before AspectJ-Maven-Plugin-In-Multi-Module
Param is [ Mock Params ]
Result is [ Mock Result ]
After AspectJ-Maven-Plugin-In-Multi-Module
```



