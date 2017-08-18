# springboot-disconf
springboot结合百度开源disconf做配置中心使用

1. 在pom中添加disconf和zk的配置如下：
```
   <dependency>
      <groupId>org.apache.zookeeper</groupId>
      <artifactId>zookeeper</artifactId>
      <version>3.4.6</version>
    </dependency>
    
    <dependency>
      <groupId>com.baidu.disconf</groupId>
      <artifactId>disconf-client</artifactId>
      <version>2.6.36</version>
    </dependency> 
```
2. 添加xml配置可参考示例中config/application-disconf.xml:

3. 在classpath下添加Disconf Client的用户配置文件 disconf.properties 和 Disconf 系统自带的配置 disconf_sys.properties。

4. SpringBootApplication 启动类添加注解@ImportResource({"classpath:config/application-disconf.xml"})//引入disconf

5. 获取分布式的配置文件中的ITEM。可通过两种方式
* 百度开源作者提供的在get方法上使用disconf注解获取的方式如下：
```
    @DisconfFileItem(name = "app.host")
    public String getHost() {
        return host;
    }
    此种方式的前提条件是必须在定义的组件上使用 @DisconfFile(filename = "app_env.properties")获取配置文件如下：
    @Component
    @Scope("singleton")
    @DisconfFile(filename = "app_env.properties")
    public class AppConfig {}
```
* 另外一种方式是使用spring注解的方式加载如下：
```
    /**
     * spring 获取配置的方式
     */
    @Value("${app.host}")
    private String host;

```
* 以上两种方式都可动态获取diconf配置中心改变的ITEM配置。
