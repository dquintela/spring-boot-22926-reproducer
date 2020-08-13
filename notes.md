# Analysis of version

This version **works**, metrics contain the tags.

Debug
1. org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration.meterRegistryPostProcessor called
2. org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusMetricsExportAutoConfiguration beans

Application run (logs)
~~~~
C:\data\apps\java11\graalvm-ce-java11-20.0.0\bin\java.exe -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.1\lib\idea_rt.jar=58163:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\data\projects\ota\spring-boot-22926-reproducer\target\classes;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-core\5.2.8.RELEASE\spring-core-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\slf4j\jcl-over-slf4j\1.7.30\jcl-over-slf4j-1.7.30.jar;C:\Users\diogo.quintela\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter\2.3.2.RELEASE\spring-boot-starter-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot\2.3.2.RELEASE\spring-boot-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-context\5.2.8.RELEASE\spring-context-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.3.2.RELEASE\spring-boot-autoconfigure-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\diogo.quintela\.m2\repository\org\yaml\snakeyaml\1.26\snakeyaml-1.26.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-log4j2\2.3.2.RELEASE\spring-boot-starter-log4j2-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\apache\logging\log4j\log4j-slf4j-impl\2.13.3\log4j-slf4j-impl-2.13.3.jar;C:\Users\diogo.quintela\.m2\repository\org\apache\logging\log4j\log4j-api\2.13.3\log4j-api-2.13.3.jar;C:\Users\diogo.quintela\.m2\repository\org\apache\logging\log4j\log4j-core\2.13.3\log4j-core-2.13.3.jar;C:\Users\diogo.quintela\.m2\repository\org\apache\logging\log4j\log4j-jul\2.13.3\log4j-jul-2.13.3.jar;C:\Users\diogo.quintela\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;C:\Users\diogo.quintela\.m2\repository\com\lmax\disruptor\3.4.2\disruptor-3.4.2.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.3.2.RELEASE\spring-boot-starter-web-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.3.2.RELEASE\spring-boot-starter-tomcat-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.37\tomcat-embed-core-9.0.37.jar;C:\Users\diogo.quintela\.m2\repository\org\glassfish\jakarta.el\3.0.3\jakarta.el-3.0.3.jar;C:\Users\diogo.quintela\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.37\tomcat-embed-websocket-9.0.37.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-web\5.2.8.RELEASE\spring-web-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-beans\5.2.8.RELEASE\spring-beans-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-webmvc\5.2.8.RELEASE\spring-webmvc-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-aop\5.2.8.RELEASE\spring-aop-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-expression\5.2.8.RELEASE\spring-expression-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\2.3.2.RELEASE\spring-boot-starter-jdbc-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\com\zaxxer\HikariCP\3.4.5\HikariCP-3.4.5.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-jdbc\5.2.8.RELEASE\spring-jdbc-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-tx\5.2.8.RELEASE\spring-tx-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\com\h2database\h2\1.4.200\h2-1.4.200.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.3.2.RELEASE\spring-boot-starter-json-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.11.1\jackson-databind-2.11.1.jar;C:\Users\diogo.quintela\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.11.1\jackson-annotations-2.11.1.jar;C:\Users\diogo.quintela\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.11.1\jackson-core-2.11.1.jar;C:\Users\diogo.quintela\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.11.1\jackson-datatype-jdk8-2.11.1.jar;C:\Users\diogo.quintela\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.11.1\jackson-datatype-jsr310-2.11.1.jar;C:\Users\diogo.quintela\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.11.1\jackson-module-parameter-names-2.11.1.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-actuator\2.3.2.RELEASE\spring-boot-starter-actuator-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-actuator-autoconfigure\2.3.2.RELEASE\spring-boot-actuator-autoconfigure-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-actuator\2.3.2.RELEASE\spring-boot-actuator-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\io\micrometer\micrometer-core\1.5.3\micrometer-core-1.5.3.jar;C:\Users\diogo.quintela\.m2\repository\org\hdrhistogram\HdrHistogram\2.1.12\HdrHistogram-2.1.12.jar;C:\Users\diogo.quintela\.m2\repository\org\latencyutils\LatencyUtils\2.0.3\LatencyUtils-2.0.3.jar;C:\Users\diogo.quintela\.m2\repository\io\micrometer\micrometer-registry-prometheus\1.5.3\micrometer-registry-prometheus-1.5.3.jar;C:\Users\diogo.quintela\.m2\repository\io\prometheus\simpleclient_common\0.8.1\simpleclient_common-0.8.1.jar;C:\Users\diogo.quintela\.m2\repository\io\prometheus\simpleclient\0.8.1\simpleclient-0.8.1.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-starter-cache\2.3.2.RELEASE\spring-boot-starter-cache-2.3.2.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\spring-context-support\5.2.8.RELEASE\spring-context-support-5.2.8.RELEASE.jar;C:\Users\diogo.quintela\.m2\repository\net\sf\ehcache\ehcache\2.10.6\ehcache-2.10.6.jar;C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot-configuration-processor\2.3.2.RELEASE\spring-boot-configuration-processor-2.3.2.RELEASE.jar org.example.springboot.issue22926.Issue22926ReproducerApplication
OpenJDK 64-Bit Server VM warning: forcing TieredStopAtLevel to full optimization because JVMCI is enabled
2020-08-13 15:21:50.515 DEBUG 13912 --- [           main] .c.l.ClasspathLoggingApplicationListener : Application started with classpath: unknown

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-13 15:21:50.577  INFO 13912 --- [           main] o.e.s.i.Issue22926ReproducerApplication  : Starting Issue22926ReproducerApplication on TRU-UoPWKGjYffo with PID 13912 (C:\data\projects\ota\spring-boot-22926-reproducer\target\classes started by Diogo.Quintela in C:\data\projects\ota\ota-smdp)
2020-08-13 15:21:50.578 DEBUG 13912 --- [           main] o.e.s.i.Issue22926ReproducerApplication  : Running with Spring Boot v2.3.2.RELEASE, Spring v5.2.8.RELEASE
2020-08-13 15:21:50.578  INFO 13912 --- [           main] o.e.s.i.Issue22926ReproducerApplication  : The following profiles are active: LOCAL
2020-08-13 15:21:50.578 DEBUG 13912 --- [           main] o.s.b.SpringApplication                  : Loading source class org.example.springboot.issue22926.Issue22926ReproducerApplication
2020-08-13 15:21:50.621 DEBUG 13912 --- [           main] o.s.b.c.c.ConfigFileApplicationListener  : Activated activeProfiles LOCAL
2020-08-13 15:21:50.622 DEBUG 13912 --- [           main] o.s.b.c.c.ConfigFileApplicationListener  : Loaded config file 'file:/C:/data/projects/ota/spring-boot-22926-reproducer/target/classes/application.properties' (classpath:/application.properties)
2020-08-13 15:21:50.622 DEBUG 13912 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277
2020-08-13 15:21:50.641 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
2020-08-13 15:21:50.649 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory'
2020-08-13 15:21:50.727 DEBUG 13912 --- [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [C:\data\projects\ota\spring-boot-22926-reproducer\target\classes\org\example\springboot\issue22926\MetricsConfiguration.class]
2020-08-13 15:21:50.960 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'management.endpoints.enabled-by-default' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:50.961 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:50.988 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.052 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.054 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.140 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.application.admin.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.143 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.aop.proxy-target-class' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.156 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.aop.proxy-target-class' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.160 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.aop.proxy-target-class' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.171 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'management.server.port' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.171 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'server.port' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.172 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'management.server.port' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.172 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'server.port' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.261 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.300 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.305 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.jmx.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.398 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.application.admin.enabled' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.403 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.aop.proxy-target-class' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.418 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.aop.proxy-target-class' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.440 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'management.server.port' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.440 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'server.port' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.509 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'propertySourcesPlaceholderConfigurer'
2020-08-13 15:21:51.513 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
2020-08-13 15:21:51.514 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'preserveErrorControllerTargetClassPostProcessor'
2020-08-13 15:21:51.515 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
2020-08-13 15:21:51.515 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.transaction.config.internalTransactionalEventListenerFactory'
2020-08-13 15:21:51.518 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
2020-08-13 15:21:51.519 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
2020-08-13 15:21:51.521 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor'
2020-08-13 15:21:51.521 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.internalConfigurationPropertiesBinder'
2020-08-13 15:21:51.521 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.internalConfigurationPropertiesBinderFactory'
2020-08-13 15:21:51.523 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dataSourceInitializerPostProcessor'
2020-08-13 15:21:51.530 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'persistenceExceptionTranslationPostProcessor'
2020-08-13 15:21:51.532 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'persistenceExceptionTranslationPostProcessor' via factory method to bean named 'environment'
2020-08-13 15:21:51.532 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.aop.proxy-target-class' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:51.536 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.aop.config.internalAutoProxyCreator'
2020-08-13 15:21:51.548 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webServerFactoryCustomizerBeanPostProcessor'
2020-08-13 15:21:51.548 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorPageRegistrarBeanPostProcessor'
2020-08-13 15:21:51.548 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthEndpointGroupsBeanPostProcessor'
2020-08-13 15:21:51.550 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.transaction.config.internalTransactionAdvisor'
2020-08-13 15:21:51.550 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration'
2020-08-13 15:21:51.558 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'transactionAttributeSource'
2020-08-13 15:21:51.562 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'transactionInterceptor'
2020-08-13 15:21:51.562 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'transactionInterceptor' via factory method to bean named 'transactionAttributeSource'
2020-08-13 15:21:51.566 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.transaction.config.internalTransactionAdvisor' via factory method to bean named 'transactionAttributeSource'
2020-08-13 15:21:51.567 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.transaction.config.internalTransactionAdvisor' via factory method to bean named 'transactionInterceptor'
2020-08-13 15:21:51.570 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'meterRegistryPostProcessor'
2020-08-13 15:21:51.571 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'meterRegistryPostProcessor' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:51.575 DEBUG 13912 --- [           main] o.s.u.c.s.UiApplicationContextUtils      : Unable to locate ThemeSource with name 'themeSource': using default [org.springframework.ui.context.support.ResourceBundleThemeSource@6069dd38]
2020-08-13 15:21:51.576 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatServletWebServerFactory'
2020-08-13 15:21:51.576 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat'
2020-08-13 15:21:51.606 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'websocketServletWebServerCustomizer'
2020-08-13 15:21:51.606 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration'
2020-08-13 15:21:51.608 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletWebServerFactoryCustomizer'
2020-08-13 15:21:51.609 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration'
2020-08-13 15:21:51.612 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:51.617 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.BoundConfigurationProperties'
2020-08-13 15:21:51.632 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:51.633 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatServletWebServerFactoryCustomizer'
2020-08-13 15:21:51.633 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatServletWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:51.635 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatWebServerFactoryCustomizer'
2020-08-13 15:21:51.635 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration'
2020-08-13 15:21:51.636 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatWebServerFactoryCustomizer' via factory method to bean named 'environment'
2020-08-13 15:21:51.637 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:51.638 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'localeCharsetMappingsCustomizer'
2020-08-13 15:21:51.638 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration'
2020-08-13 15:21:51.640 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration' via constructor to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:51.672 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorPageCustomizer'
2020-08-13 15:21:51.672 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration'
2020-08-13 15:21:51.673 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration' via constructor to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:51.675 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServletRegistration'
2020-08-13 15:21:51.675 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration'
2020-08-13 15:21:51.677 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServlet'
2020-08-13 15:21:51.677 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration'
2020-08-13 15:21:51.679 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2020-08-13 15:21:51.685 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServlet' via factory method to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2020-08-13 15:21:51.706 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServletRegistration' via factory method to bean named 'dispatcherServlet'
2020-08-13 15:21:51.706 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServletRegistration' via factory method to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2020-08-13 15:21:51.711 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'multipartConfigElement'
2020-08-13 15:21:51.711 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration'
2020-08-13 15:21:51.712 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties'
2020-08-13 15:21:51.717 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration' via constructor to bean named 'spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties'
2020-08-13 15:21:51.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'errorPageCustomizer' via factory method to bean named 'dispatcherServletRegistration'
2020-08-13 15:21:51.788 DEBUG 13912 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot\2.3.2.RELEASE\spring-boot-2.3.2.RELEASE.jar
2020-08-13 15:21:51.789 DEBUG 13912 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot\2.3.2.RELEASE\spring-boot-2.3.2.RELEASE.jar
2020-08-13 15:21:51.789 DEBUG 13912 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : None of the document roots [src/main/webapp, public, static] point to a directory and will be ignored.
2020-08-13 15:21:51.812  INFO 13912 --- [           main] o.s.b.w.e.t.TomcatWebServer              : Tomcat initialized with port(s): 8080 (http)
2020-08-13 15:21:51.820  INFO 13912 --- [           main] o.a.c.c.StandardService                  : Starting service [Tomcat]
2020-08-13 15:21:51.821  INFO 13912 --- [           main] o.a.c.c.StandardEngine                   : Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-08-13 15:21:51.894  INFO 13912 --- [           main] o.a.c.c.C.[.[.[/]                        : Initializing Spring embedded WebApplicationContext
2020-08-13 15:21:51.894 DEBUG 13912 --- [           main] w.s.c.ServletWebServerApplicationContext : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2020-08-13 15:21:51.894  INFO 13912 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1272 ms
2020-08-13 15:21:51.895 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webMvcMetricsFilter'
2020-08-13 15:21:51.895 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration'
2020-08-13 15:21:51.896 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties'
2020-08-13 15:21:51.901 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration' via constructor to bean named 'management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties'
2020-08-13 15:21:51.902 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'prometheusMeterRegistry'
2020-08-13 15:21:51.903 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusMetricsExportAutoConfiguration'
2020-08-13 15:21:51.903 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'prometheusConfig'
2020-08-13 15:21:51.904 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.metrics.export.prometheus-org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusProperties'
2020-08-13 15:21:51.906 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'prometheusConfig' via factory method to bean named 'management.metrics.export.prometheus-org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusProperties'
2020-08-13 15:21:51.910 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'collectorRegistry'
2020-08-13 15:21:51.911 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'micrometerClock'
2020-08-13 15:21:51.912 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration'
2020-08-13 15:21:51.913 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'prometheusMeterRegistry' via factory method to bean named 'prometheusConfig'
2020-08-13 15:21:51.913 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'prometheusMeterRegistry' via factory method to bean named 'collectorRegistry'
2020-08-13 15:21:51.913 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'prometheusMeterRegistry' via factory method to bean named 'micrometerClock'
2020-08-13 15:21:51.929 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'propertiesMeterFilter'
2020-08-13 15:21:51.929 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'propertiesMeterFilter' via factory method to bean named 'management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties'
2020-08-13 15:21:51.932 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsHttpClientUriTagFilter'
2020-08-13 15:21:51.932 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration'
2020-08-13 15:21:51.933 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsHttpClientUriTagFilter' via factory method to bean named 'management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties'
2020-08-13 15:21:51.935 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsHttpServerUriTagFilter'
2020-08-13 15:21:51.937 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jvmCompilationMetrics'
2020-08-13 15:21:51.937 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsConfiguration'
2020-08-13 15:21:51.937 DEBUG 13912 --- [           main] ocalVariableTableParameterNameDiscoverer : Cannot find '.class' file for class [class org.example.springboot.issue22926.MetricsConfiguration$$EnhancerBySpringCGLIB$$91093771] - unable to determine constructor/method parameter names
2020-08-13 15:21:51.938 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsConfiguration' via constructor to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:51.948 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jvmHeapPressureMetrics'
2020-08-13 15:21:51.952 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jvmGcMetrics'
2020-08-13 15:21:51.953 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration'
2020-08-13 15:21:51.966 DEBUG 13912 --- [           main] i.m.c.u.i.l.InternalLoggerFactory        : Using SLF4J as the default logging framework
2020-08-13 15:21:51.967 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jvmMemoryMetrics'
2020-08-13 15:21:51.967 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jvmThreadMetrics'
2020-08-13 15:21:51.968 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'classLoaderMetrics'
2020-08-13 15:21:51.968 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'log4j2Metrics'
2020-08-13 15:21:51.969 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.Log4J2MetricsAutoConfiguration'
2020-08-13 15:21:51.975 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'uptimeMetrics'
2020-08-13 15:21:51.975 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration'
2020-08-13 15:21:51.977 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'processorMetrics'
2020-08-13 15:21:51.979 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'fileDescriptorMetrics'
2020-08-13 15:21:52.006 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webMvcTagsProvider'
2020-08-13 15:21:52.008 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webMvcMetricsFilter' via factory method to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:52.008 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webMvcMetricsFilter' via factory method to bean named 'webMvcTagsProvider'
2020-08-13 15:21:52.011 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestContextFilter'
2020-08-13 15:21:52.013 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'formContentFilter'
2020-08-13 15:21:52.013 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration'
2020-08-13 15:21:52.016 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'characterEncodingFilter'
2020-08-13 15:21:52.022 DEBUG 13912 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: filterRegistrationBean urls=[/*] order=-2147483647, characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2020-08-13 15:21:52.023 DEBUG 13912 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2020-08-13 15:21:52.034 DEBUG 13912 --- [           main] o.s.b.a.m.w.s.WebMvcMetricsFilter        : Filter 'webMvcMetricsFilter' configured for use
2020-08-13 15:21:52.034 DEBUG 13912 --- [           main] o.s.b.w.s.f.OrderedRequestContextFilter  : Filter 'requestContextFilter' configured for use
2020-08-13 15:21:52.034 DEBUG 13912 --- [           main] s.b.w.s.f.OrderedCharacterEncodingFilter : Filter 'characterEncodingFilter' configured for use
2020-08-13 15:21:52.034 DEBUG 13912 --- [           main] o.s.b.w.s.f.OrderedFormContentFilter     : Filter 'formContentFilter' configured for use
2020-08-13 15:21:52.041 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'issue22926ReproducerApplication'
2020-08-13 15:21:52.042 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsAdvisor'
2020-08-13 15:21:52.047 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.AutoConfigurationPackages'
2020-08-13 15:21:52.048 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration'
2020-08-13 15:21:52.048 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration'
2020-08-13 15:21:52.049 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.ConfigurationBeanFactoryMetadata'
2020-08-13 15:21:52.049 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration'
2020-08-13 15:21:52.050 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration'
2020-08-13 15:21:52.051 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'taskExecutorBuilder'
2020-08-13 15:21:52.052 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties'
2020-08-13 15:21:52.054 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'taskExecutorBuilder' via factory method to bean named 'spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties'
2020-08-13 15:21:52.056 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration'
2020-08-13 15:21:52.057 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'error'
2020-08-13 15:21:52.057 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'beanNameViewResolver'
2020-08-13 15:21:52.058 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration'
2020-08-13 15:21:52.060 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties'
2020-08-13 15:21:52.063 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration' via constructor to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.063 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration' via constructor to bean named 'spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties'
2020-08-13 15:21:52.064 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'conventionErrorViewResolver'
2020-08-13 15:21:52.065 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorAttributes'
2020-08-13 15:21:52.067 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'basicErrorController'
2020-08-13 15:21:52.068 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'basicErrorController' via factory method to bean named 'errorAttributes'
2020-08-13 15:21:52.075 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration'
2020-08-13 15:21:52.077 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration' via constructor to bean named 'spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties'
2020-08-13 15:21:52.077 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration' via constructor to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@6bc28a83'
2020-08-13 15:21:52.085 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter'
2020-08-13 15:21:52.085 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter' via constructor to bean named 'spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties'
2020-08-13 15:21:52.085 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter' via constructor to bean named 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties'
2020-08-13 15:21:52.085 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter' via constructor to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@6bc28a83'
2020-08-13 15:21:52.087 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsWebMvcConfigurer'
2020-08-13 15:21:52.087 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsWebMvcConfigurer' via factory method to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:52.087 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsWebMvcConfigurer' via factory method to bean named 'webMvcTagsProvider'
2020-08-13 15:21:52.089 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestMappingHandlerAdapter'
2020-08-13 15:21:52.091 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcContentNegotiationManager'
2020-08-13 15:21:52.098 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcConversionService'
2020-08-13 15:21:52.104 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcValidator'
2020-08-13 15:21:52.106 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.106 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.106 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcValidator'
2020-08-13 15:21:52.110 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.110 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.110 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcValidator'
2020-08-13 15:21:52.116 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'messageConverters'
2020-08-13 15:21:52.116 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration'
2020-08-13 15:21:52.119 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'stringHttpMessageConverter'
2020-08-13 15:21:52.119 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration'
2020-08-13 15:21:52.120 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'stringHttpMessageConverter' via factory method to bean named 'environment'
2020-08-13 15:21:52.126 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mappingJackson2HttpMessageConverter'
2020-08-13 15:21:52.127 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration'
2020-08-13 15:21:52.127 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jacksonObjectMapper'
2020-08-13 15:21:52.128 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration'
2020-08-13 15:21:52.128 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration'
2020-08-13 15:21:52.129 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'standardJacksonObjectMapperBuilderCustomizer'
2020-08-13 15:21:52.129 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration'
2020-08-13 15:21:52.130 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties'
2020-08-13 15:21:52.133 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'standardJacksonObjectMapperBuilderCustomizer' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.133 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'standardJacksonObjectMapperBuilderCustomizer' via factory method to bean named 'spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties'
2020-08-13 15:21:52.133 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jacksonObjectMapperBuilder' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.134 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jacksonObjectMapperBuilder' via factory method to bean named 'standardJacksonObjectMapperBuilderCustomizer'
2020-08-13 15:21:52.135 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'parameterNamesModule'
2020-08-13 15:21:52.135 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration'
2020-08-13 15:21:52.138 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jsonComponentModule'
2020-08-13 15:21:52.138 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration'
2020-08-13 15:21:52.149 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jacksonObjectMapper' via factory method to bean named 'jacksonObjectMapperBuilder'
2020-08-13 15:21:52.164 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mappingJackson2HttpMessageConverter' via factory method to bean named 'jacksonObjectMapper'
2020-08-13 15:21:52.170 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'applicationTaskExecutor'
2020-08-13 15:21:52.171 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'applicationTaskExecutor' via factory method to bean named 'taskExecutorBuilder'
2020-08-13 15:21:52.174  INFO 13912 --- [           main] o.s.s.c.ThreadPoolTaskExecutor           : Initializing ExecutorService 'applicationTaskExecutor'
2020-08-13 15:21:52.181 DEBUG 13912 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2020-08-13 15:21:52.193 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestMappingHandlerMapping'
2020-08-13 15:21:52.194 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcResourceUrlProvider'
2020-08-13 15:21:52.196 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.196 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.196 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.196 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.197 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.197 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.215 DEBUG 13912 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 2 mappings in 'requestMappingHandlerMapping'
2020-08-13 15:21:52.217 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'welcomePageHandlerMapping'
2020-08-13 15:21:52.217 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageHandlerMapping' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.217 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.217 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'welcomePageHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.223 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcPathMatcher'
2020-08-13 15:21:52.224 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcUrlPathHelper'
2020-08-13 15:21:52.225 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewControllerHandlerMapping'
2020-08-13 15:21:52.227 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcPathMatcher'
2020-08-13 15:21:52.227 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcUrlPathHelper'
2020-08-13 15:21:52.227 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.227 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.227 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'beanNameHandlerMapping'
2020-08-13 15:21:52.228 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beanNameHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.228 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beanNameHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.231 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'routerFunctionMapping'
2020-08-13 15:21:52.231 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'routerFunctionMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.231 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'routerFunctionMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.234 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'resourceHandlerMapping'
2020-08-13 15:21:52.234 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcUrlPathHelper'
2020-08-13 15:21:52.235 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcPathMatcher'
2020-08-13 15:21:52.235 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.235 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.235 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.243 DEBUG 13912 --- [           main] o.s.w.s.h.SimpleUrlHandlerMapping        : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2020-08-13 15:21:52.244 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'defaultServletHandlerMapping'
2020-08-13 15:21:52.244 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerFunctionAdapter'
2020-08-13 15:21:52.246 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcUriComponentsContributor'
2020-08-13 15:21:52.247 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcUriComponentsContributor' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.247 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcUriComponentsContributor' via factory method to bean named 'requestMappingHandlerAdapter'
2020-08-13 15:21:52.249 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'httpRequestHandlerAdapter'
2020-08-13 15:21:52.249 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'simpleControllerHandlerAdapter'
2020-08-13 15:21:52.250 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerExceptionResolver'
2020-08-13 15:21:52.250 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'handlerExceptionResolver' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.254 DEBUG 13912 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2020-08-13 15:21:52.256 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcViewResolver'
2020-08-13 15:21:52.257 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcViewResolver' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.259 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'defaultViewResolver'
2020-08-13 15:21:52.264 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewResolver'
2020-08-13 15:21:52.264 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewResolver' via factory method to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@6bc28a83'
2020-08-13 15:21:52.267 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.audit.AuditEventsEndpointAutoConfiguration'
2020-08-13 15:21:52.268 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration'
2020-08-13 15:21:52.268 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'applicationAvailability'
2020-08-13 15:21:52.270 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.availability.AvailabilityHealthContributorAutoConfiguration'
2020-08-13 15:21:52.271 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.beans.BeansEndpointAutoConfiguration'
2020-08-13 15:21:52.272 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'beansEndpoint'
2020-08-13 15:21:52.272 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beansEndpoint' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.273 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Hikari'
2020-08-13 15:21:52.274 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dataSource'
2020-08-13 15:21:52.274 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.datasource-org.springframework.boot.autoconfigure.jdbc.DataSourceProperties'
2020-08-13 15:21:52.279 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dataSource' via factory method to bean named 'spring.datasource-org.springframework.boot.autoconfigure.jdbc.DataSourceProperties'
2020-08-13 15:21:52.287 DEBUG 13912 --- [           main] c.z.h.HikariConfig                       : Driver class org.h2.Driver found in Thread context class loader jdk.internal.loader.ClassLoaders$AppClassLoader@3764951d
2020-08-13 15:21:52.296 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker'
2020-08-13 15:21:52.297 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker' via constructor to bean named 'spring.datasource-org.springframework.boot.autoconfigure.jdbc.DataSourceProperties'
2020-08-13 15:21:52.297 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker' via constructor to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.300 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceJmxConfiguration$Hikari'
2020-08-13 15:21:52.301 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.jdbc.DataSourceJmxConfiguration$Hikari' via constructor to bean named 'dataSource'
2020-08-13 15:21:52.302 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceJmxConfiguration'
2020-08-13 15:21:52.303 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration$PooledDataSourceConfiguration'
2020-08-13 15:21:52.304 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration$HikariPoolDataSourceMetadataProviderConfiguration'
2020-08-13 15:21:52.304 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'hikariPoolDataSourceMetadataProvider'
2020-08-13 15:21:52.306 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration'
2020-08-13 15:21:52.306 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceInitializationConfiguration'
2020-08-13 15:21:52.306 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration'
2020-08-13 15:21:52.306 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.cache.CachesEndpointAutoConfiguration'
2020-08-13 15:21:52.307 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'cachesEndpoint'
2020-08-13 15:21:52.311 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'cachesEndpointWebExtension'
2020-08-13 15:21:52.312 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'cachesEndpointWebExtension' via factory method to bean named 'cachesEndpoint'
2020-08-13 15:21:52.313 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementContextAutoConfiguration'
2020-08-13 15:21:52.313 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletWebChildContextFactory'
2020-08-13 15:21:52.313 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'managementServletContext'
2020-08-13 15:21:52.314 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.317 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'managementServletContext' via factory method to bean named 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.318 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.health.LegacyHealthEndpointAdaptersConfiguration'
2020-08-13 15:21:52.318 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.health.LegacyHealthEndpointCompatibilityConfiguration'
2020-08-13 15:21:52.318 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthAggregator'
2020-08-13 15:21:52.319 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.health.status-org.springframework.boot.actuate.autoconfigure.health.HealthIndicatorProperties'
2020-08-13 15:21:52.320 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthAggregator' via factory method to bean named 'management.health.status-org.springframework.boot.actuate.autoconfigure.health.HealthIndicatorProperties'
2020-08-13 15:21:52.321 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthIndicatorRegistry'
2020-08-13 15:21:52.322 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthContributorRegistry'
2020-08-13 15:21:52.322 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.health.HealthEndpointConfiguration'
2020-08-13 15:21:52.323 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthEndpointGroups'
2020-08-13 15:21:52.323 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthEndpointProperties'
2020-08-13 15:21:52.323 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration'
2020-08-13 15:21:52.323 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpointProperties' via factory method to bean named 'management.health.status-org.springframework.boot.actuate.autoconfigure.health.HealthIndicatorProperties'
2020-08-13 15:21:52.326 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpointGroups' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.327 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpointGroups' via factory method to bean named 'healthEndpointProperties'
2020-08-13 15:21:52.328 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthStatusAggregator'
2020-08-13 15:21:52.328 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthStatusAggregator' via factory method to bean named 'healthEndpointProperties'
2020-08-13 15:21:52.330 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthHttpCodeStatusMapper'
2020-08-13 15:21:52.330 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthHttpCodeStatusMapper' via factory method to bean named 'healthEndpointProperties'
2020-08-13 15:21:52.333 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthContributorRegistry' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.333 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthContributorRegistry' via factory method to bean named 'healthEndpointGroups'
2020-08-13 15:21:52.333 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'diskSpaceHealthIndicator'
2020-08-13 15:21:52.333 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthContributorAutoConfiguration'
2020-08-13 15:21:52.334 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.health.diskspace-org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthIndicatorProperties'
2020-08-13 15:21:52.335 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'diskSpaceHealthIndicator' via factory method to bean named 'management.health.diskspace-org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthIndicatorProperties'
2020-08-13 15:21:52.336 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'pingHealthContributor'
2020-08-13 15:21:52.336 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration'
2020-08-13 15:21:52.337 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dbHealthContributor'
2020-08-13 15:21:52.337 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthContributorAutoConfiguration'
2020-08-13 15:21:52.337 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthContributorAutoConfiguration' via constructor to bean named 'dataSource'
2020-08-13 15:21:52.339 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dbHealthContributor' via factory method to bean named 'dataSource'
2020-08-13 15:21:52.345 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthIndicatorRegistry' via factory method to bean named 'healthContributorRegistry'
2020-08-13 15:21:52.346 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthEndpoint'
2020-08-13 15:21:52.346 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpoint' via factory method to bean named 'healthContributorRegistry'
2020-08-13 15:21:52.346 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpoint' via factory method to bean named 'healthEndpointGroups'
2020-08-13 15:21:52.348 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.health.HealthEndpointWebExtensionConfiguration'
2020-08-13 15:21:52.349 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'healthEndpointWebExtension'
2020-08-13 15:21:52.349 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpointWebExtension' via factory method to bean named 'healthContributorRegistry'
2020-08-13 15:21:52.349 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'healthEndpointWebExtension' via factory method to bean named 'healthEndpointGroups'
2020-08-13 15:21:52.350 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration'
2020-08-13 15:21:52.350 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties'
2020-08-13 15:21:52.351 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration' via constructor to bean named 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties'
2020-08-13 15:21:52.352 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration'
2020-08-13 15:21:52.353 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'envInfoContributor'
2020-08-13 15:21:52.353 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'envInfoContributor' via factory method to bean named 'environment'
2020-08-13 15:21:52.354 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.info-org.springframework.boot.actuate.autoconfigure.info.InfoContributorProperties'
2020-08-13 15:21:52.356 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.info.InfoEndpointAutoConfiguration'
2020-08-13 15:21:52.357 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'infoEndpoint'
2020-08-13 15:21:52.358 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpointAutoConfiguration'
2020-08-13 15:21:52.358 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'conditionsReportEndpoint'
2020-08-13 15:21:52.358 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'conditionsReportEndpoint' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.359 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.context.ShutdownEndpointAutoConfiguration'
2020-08-13 15:21:52.360 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'shutdownEndpoint'
2020-08-13 15:21:52.361 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointAutoConfiguration'
2020-08-13 15:21:52.361 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'configurationPropertiesReportEndpoint'
2020-08-13 15:21:52.362 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.endpoint.configprops-org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointProperties'
2020-08-13 15:21:52.363 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'configurationPropertiesReportEndpoint' via factory method to bean named 'management.endpoint.configprops-org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointProperties'
2020-08-13 15:21:52.365 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration'
2020-08-13 15:21:52.365 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'endpointOperationParameterMapper'
2020-08-13 15:21:52.367 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'endpointCachingOperationInvokerAdvisor'
2020-08-13 15:21:52.367 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'endpointCachingOperationInvokerAdvisor' via factory method to bean named 'environment'
2020-08-13 15:21:52.369 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration'
2020-08-13 15:21:52.369 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration' via constructor to bean named 'environment'
2020-08-13 15:21:52.369 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mbeanExporter'
2020-08-13 15:21:52.370 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'objectNamingStrategy'
2020-08-13 15:21:52.371 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mbeanExporter' via factory method to bean named 'objectNamingStrategy'
2020-08-13 15:21:52.371 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mbeanExporter' via factory method to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@6bc28a83'
2020-08-13 15:21:52.374 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mbeanServer'
2020-08-13 15:21:52.376 DEBUG 13912 --- [           main] o.s.j.s.JmxUtils                         : Found MBeanServer: com.sun.jmx.mbeanserver.JmxMBeanServer@769c9116
2020-08-13 15:21:52.380 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration'
2020-08-13 15:21:52.380 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.endpoints.jmx-org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointProperties'
2020-08-13 15:21:52.381 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration' via constructor to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.381 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration' via constructor to bean named 'management.endpoints.jmx-org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointProperties'
2020-08-13 15:21:52.382 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jmxAnnotationEndpointDiscoverer'
2020-08-13 15:21:52.382 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jmxAnnotationEndpointDiscoverer' via factory method to bean named 'endpointOperationParameterMapper'
2020-08-13 15:21:52.383 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jmxIncludeExcludePropertyEndpointFilter'
2020-08-13 15:21:52.386 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jmxMBeanExporter'
2020-08-13 15:21:52.387 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jmxMBeanExporter' via factory method to bean named 'mbeanServer'
2020-08-13 15:21:52.387 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jmxMBeanExporter' via factory method to bean named 'environment'
2020-08-13 15:21:52.387 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jmxMBeanExporter' via factory method to bean named 'jmxAnnotationEndpointDiscoverer'
2020-08-13 15:21:52.399 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'environmentEndpoint'
2020-08-13 15:21:52.399 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointAutoConfiguration'
2020-08-13 15:21:52.400 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.endpoint.env-org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointProperties'
2020-08-13 15:21:52.401 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'environmentEndpoint' via factory method to bean named 'environment'
2020-08-13 15:21:52.401 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'environmentEndpoint' via factory method to bean named 'management.endpoint.env-org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointProperties'
2020-08-13 15:21:52.413 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'loggersEndpoint'
2020-08-13 15:21:52.414 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.logging.LoggersEndpointAutoConfiguration'
2020-08-13 15:21:52.414 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'loggersEndpoint' via factory method to bean named 'springBootLoggingSystem'
2020-08-13 15:21:52.416 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'heapDumpWebEndpoint'
2020-08-13 15:21:52.416 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.management.HeapDumpWebEndpointAutoConfiguration'
2020-08-13 15:21:52.418 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dumpEndpoint'
2020-08-13 15:21:52.418 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.management.ThreadDumpEndpointAutoConfiguration'
2020-08-13 15:21:52.420 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'prometheusEndpoint'
2020-08-13 15:21:52.420 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusMetricsExportAutoConfiguration$PrometheusScrapeEndpointConfiguration'
2020-08-13 15:21:52.421 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'prometheusEndpoint' via factory method to bean named 'collectorRegistry'
2020-08-13 15:21:52.421 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsEndpoint'
2020-08-13 15:21:52.421 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.MetricsEndpointAutoConfiguration'
2020-08-13 15:21:52.422 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsEndpoint' via factory method to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:52.424 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'scheduledTasksEndpoint'
2020-08-13 15:21:52.424 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.scheduling.ScheduledTasksEndpointAutoConfiguration'
2020-08-13 15:21:52.427 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mappingsEndpoint'
2020-08-13 15:21:52.427 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration'
2020-08-13 15:21:52.428 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mappingsEndpoint' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.429 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServletMappingDescriptionProvider'
2020-08-13 15:21:52.429 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration$ServletWebConfiguration$SpringMvcConfiguration'
2020-08-13 15:21:52.432 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletMappingDescriptionProvider'
2020-08-13 15:21:52.432 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration$ServletWebConfiguration'
2020-08-13 15:21:52.433 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'filterMappingDescriptionProvider'
2020-08-13 15:21:52.444 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration$WebEndpointServletConfiguration'
2020-08-13 15:21:52.445 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletEndpointDiscoverer'
2020-08-13 15:21:52.445 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletEndpointDiscoverer' via factory method to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.446 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webEndpointPathMapper'
2020-08-13 15:21:52.446 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration'
2020-08-13 15:21:52.446 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration' via constructor to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.446 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration' via constructor to bean named 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.449 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'endpointMediaTypes'
2020-08-13 15:21:52.449 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webEndpointDiscoverer'
2020-08-13 15:21:52.450 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointDiscoverer' via factory method to bean named 'endpointOperationParameterMapper'
2020-08-13 15:21:52.450 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointDiscoverer' via factory method to bean named 'endpointMediaTypes'
2020-08-13 15:21:52.451 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webExposeExcludePropertyEndpointFilter'
2020-08-13 15:21:52.453 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'controllerEndpointDiscoverer'
2020-08-13 15:21:52.454 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'controllerExposeExcludePropertyEndpointFilter'
2020-08-13 15:21:52.455 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'pathMappedEndpoints'
2020-08-13 15:21:52.456 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'pathMappedEndpoints' via factory method to bean named 'jmxAnnotationEndpointDiscoverer'
2020-08-13 15:21:52.456 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'pathMappedEndpoints' via factory method to bean named 'servletEndpointDiscoverer'
2020-08-13 15:21:52.456 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'pathMappedEndpoints' via factory method to bean named 'webEndpointDiscoverer'
2020-08-13 15:21:52.456 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'pathMappedEndpoints' via factory method to bean named 'controllerEndpointDiscoverer'
2020-08-13 15:21:52.473 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'environmentEndpointWebExtension'
2020-08-13 15:21:52.474 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'environmentEndpointWebExtension' via factory method to bean named 'environmentEndpoint'
2020-08-13 15:21:52.481 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.logging.LogFileWebEndpointAutoConfiguration'
2020-08-13 15:21:52.482 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.endpoint.logfile-org.springframework.boot.actuate.autoconfigure.logging.LogFileWebEndpointProperties'
2020-08-13 15:21:52.483 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration'
2020-08-13 15:21:52.483 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration$HikariDataSourceMetricsConfiguration'
2020-08-13 15:21:52.484 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration$HikariDataSourceMetricsConfiguration' via constructor to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:52.485 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration$DataSourcePoolMetadataMetricsConfiguration'
2020-08-13 15:21:52.489 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration'
2020-08-13 15:21:52.489 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration'
2020-08-13 15:21:52.489 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration'
2020-08-13 15:21:52.490 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.web.client.RestTemplateMetricsConfiguration'
2020-08-13 15:21:52.490 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'restTemplateExchangeTagsProvider'
2020-08-13 15:21:52.491 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'metricsRestTemplateCustomizer'
2020-08-13 15:21:52.491 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsRestTemplateCustomizer' via factory method to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:52.491 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsRestTemplateCustomizer' via factory method to bean named 'restTemplateExchangeTagsProvider'
2020-08-13 15:21:52.491 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'metricsRestTemplateCustomizer' via factory method to bean named 'management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties'
2020-08-13 15:21:52.493 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat.TomcatMetricsAutoConfiguration'
2020-08-13 15:21:52.493 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatMetricsBinder'
2020-08-13 15:21:52.494 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatMetricsBinder' via factory method to bean named 'prometheusMeterRegistry'
2020-08-13 15:21:52.494 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceEndpointAutoConfiguration'
2020-08-13 15:21:52.495 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration'
2020-08-13 15:21:52.495 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'springApplicationAdminRegistrar'
2020-08-13 15:21:52.495 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'springApplicationAdminRegistrar' via factory method to bean named 'environment'
2020-08-13 15:21:52.497 DEBUG 13912 --- [           main] inMXBeanRegistrar$SpringApplicationAdmin : Application Admin MBean registered with name 'org.springframework.boot:type=Admin,name=SpringApplication'
2020-08-13 15:21:52.497 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration'
2020-08-13 15:21:52.498 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration' via constructor to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@6bc28a83'
2020-08-13 15:21:52.498 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration'
2020-08-13 15:21:52.498 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration'
2020-08-13 15:21:52.498 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration'
2020-08-13 15:21:52.498 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'lifecycleProcessor'
2020-08-13 15:21:52.499 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties'
2020-08-13 15:21:52.499 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'lifecycleProcessor' via factory method to bean named 'spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties'
2020-08-13 15:21:52.500 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration'
2020-08-13 15:21:52.500 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.JdbcTemplateConfiguration'
2020-08-13 15:21:52.501 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'jdbcTemplate'
2020-08-13 15:21:52.501 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.jdbc-org.springframework.boot.autoconfigure.jdbc.JdbcProperties'
2020-08-13 15:21:52.502 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jdbcTemplate' via factory method to bean named 'dataSource'
2020-08-13 15:21:52.502 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'jdbcTemplate' via factory method to bean named 'spring.jdbc-org.springframework.boot.autoconfigure.jdbc.JdbcProperties'
2020-08-13 15:21:52.509 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcTemplateConfiguration'
2020-08-13 15:21:52.510 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'namedParameterJdbcTemplate'
2020-08-13 15:21:52.510 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'namedParameterJdbcTemplate' via factory method to bean named 'jdbcTemplate'
2020-08-13 15:21:52.512 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration'
2020-08-13 15:21:52.513 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration'
2020-08-13 15:21:52.513 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'taskSchedulerBuilder'
2020-08-13 15:21:52.514 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
2020-08-13 15:21:52.515 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'taskSchedulerBuilder' via factory method to bean named 'spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties'
2020-08-13 15:21:52.517 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration$DataSourceTransactionManagerConfiguration'
2020-08-13 15:21:52.517 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'transactionManager'
2020-08-13 15:21:52.517 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'transactionManager' via factory method to bean named 'dataSource'
2020-08-13 15:21:52.519 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'platformTransactionManagerCustomizers'
2020-08-13 15:21:52.519 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration'
2020-08-13 15:21:52.521 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'spring.transaction-org.springframework.boot.autoconfigure.transaction.TransactionProperties'
2020-08-13 15:21:52.525 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration'
2020-08-13 15:21:52.525 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration$CglibAutoProxyConfiguration'
2020-08-13 15:21:52.526 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration'
2020-08-13 15:21:52.526 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$TransactionTemplateConfiguration'
2020-08-13 15:21:52.526 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'transactionTemplate'
2020-08-13 15:21:52.527 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'transactionTemplate' via factory method to bean named 'transactionManager'
2020-08-13 15:21:52.528 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration'
2020-08-13 15:21:52.528 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'multipartResolver'
2020-08-13 15:21:52.529 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$DifferentManagementContextConfiguration'
2020-08-13 15:21:52.530 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$DifferentManagementContextConfiguration' via constructor to bean named 'org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1c55f277'
2020-08-13 15:21:52.530 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$DifferentManagementContextConfiguration' via constructor to bean named 'servletWebChildContextFactory'
2020-08-13 15:21:52.531 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration'
2020-08-13 15:21:52.531 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.server-org.springframework.boot.actuate.autoconfigure.web.server.ManagementServerProperties'
2020-08-13 15:21:52.540 DEBUG 13912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2020-08-13 15:21:52.540 DEBUG 13912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Autodetecting user-defined JMX MBeans
2020-08-13 15:21:52.541 DEBUG 13912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'dataSource' has been autodetected for JMX exposure
2020-08-13 15:21:52.546 DEBUG 13912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located MBean 'dataSource': registering with JMX server as MBean [com.zaxxer.hikari:name=dataSource,type=HikariDataSource]
2020-08-13 15:21:52.548 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Starting beans in phase 2147483646
2020-08-13 15:21:52.563  INFO 13912 --- [           main] o.s.b.w.e.t.TomcatWebServer              : Tomcat started on port(s): 8080 (http) with context path ''
2020-08-13 15:21:52.566 DEBUG 13912 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6d5f4900
2020-08-13 15:21:52.569 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
2020-08-13 15:21:52.607 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'handlerExceptionResolver' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration; factoryMethodName=handlerExceptionResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/web/servlet/config/annotation/DelegatingWebMvcConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.actuate.autoconfigure.web.servlet.WebMvcEndpointChildContextConfiguration; factoryMethodName=compositeHandlerExceptionResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/actuate/autoconfigure/web/servlet/WebMvcEndpointChildContextConfiguration.class]]
2020-08-13 15:21:52.615 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'propertySourcesPlaceholderConfigurer'
2020-08-13 15:21:52.616 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
2020-08-13 15:21:52.616 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
2020-08-13 15:21:52.616 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
2020-08-13 15:21:52.617 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
2020-08-13 15:21:52.617 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor'
2020-08-13 15:21:52.617 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.internalConfigurationPropertiesBinder'
2020-08-13 15:21:52.617 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.internalConfigurationPropertiesBinderFactory'
2020-08-13 15:21:52.618 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webServerFactoryCustomizerBeanPostProcessor'
2020-08-13 15:21:52.618 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorPageRegistrarBeanPostProcessor'
2020-08-13 15:21:52.619 DEBUG 13912 --- [           main] o.s.u.c.s.UiApplicationContextUtils      : Unable to locate ThemeSource with name 'themeSource': using default [org.springframework.ui.context.support.DelegatingThemeSource@3a4a5f3c]
2020-08-13 15:21:52.619 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'ServletWebServerFactory'
2020-08-13 15:21:52.620 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletWebServerFactoryCustomizer'
2020-08-13 15:21:52.620 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletWebServerFactoryAutoConfiguration'
2020-08-13 15:21:52.621 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:52.621 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatServletWebServerFactoryCustomizer'
2020-08-13 15:21:52.621 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'tomcatServletWebServerFactoryCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:52.622 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletManagementWebServerFactoryCustomizer'
2020-08-13 15:21:52.622 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementChildContextConfiguration'
2020-08-13 15:21:52.623 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletManagementWebServerFactoryCustomizer' via factory method to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@585513a8'
2020-08-13 15:21:52.630 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'tomcatManagementAccessLogCustomizer'
2020-08-13 15:21:52.631 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'managementErrorPageCustomizer'
2020-08-13 15:21:52.631 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.web.servlet.WebMvcEndpointChildContextConfiguration'
2020-08-13 15:21:52.632 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'managementErrorPageCustomizer' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:52.644 DEBUG 13912 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot\2.3.2.RELEASE\spring-boot-2.3.2.RELEASE.jar
2020-08-13 15:21:52.645 DEBUG 13912 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\diogo.quintela\.m2\repository\org\springframework\boot\spring-boot\2.3.2.RELEASE\spring-boot-2.3.2.RELEASE.jar
2020-08-13 15:21:52.645 DEBUG 13912 --- [           main] .s.b.w.e.t.TomcatServletWebServerFactory : None of the document roots [src/main/webapp, public, static] point to a directory and will be ignored.
2020-08-13 15:21:52.647  INFO 13912 --- [           main] o.s.b.w.e.t.TomcatWebServer              : Tomcat initialized with port(s): 8085 (http)
2020-08-13 15:21:52.648  INFO 13912 --- [           main] o.a.c.c.StandardService                  : Starting service [Tomcat]
2020-08-13 15:21:52.649  INFO 13912 --- [           main] o.a.c.c.StandardEngine                   : Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-08-13 15:21:52.670  INFO 13912 --- [           main] o.a.c.c.C.[.[.[/]                        : Initializing Spring embedded WebApplicationContext
2020-08-13 15:21:52.670 DEBUG 13912 --- [           main] w.s.c.ServletWebServerApplicationContext : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2020-08-13 15:21:52.670  INFO 13912 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 104 ms
2020-08-13 15:21:52.671 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletEndpointRegistrar'
2020-08-13 15:21:52.671 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration$WebMvcServletEndpointManagementContextConfiguration'
2020-08-13 15:21:52.672 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServletRegistration'
2020-08-13 15:21:52.673 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'dispatcherServlet'
2020-08-13 15:21:52.673 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'dispatcherServletRegistration' via factory method to bean named 'dispatcherServlet'
2020-08-13 15:21:52.674 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletEndpointRegistrar' via factory method to bean named 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.674 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletEndpointRegistrar' via factory method to bean named 'servletEndpointDiscoverer'
2020-08-13 15:21:52.674 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletEndpointRegistrar' via factory method to bean named 'dispatcherServletRegistration'
2020-08-13 15:21:52.675 DEBUG 13912 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters:
2020-08-13 15:21:52.675 DEBUG 13912 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2020-08-13 15:21:52.677 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'enableChildManagementContextConfiguration'
2020-08-13 15:21:52.678 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'propertyPlaceholderAutoConfiguration'
2020-08-13 15:21:52.678 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.BoundConfigurationProperties'
2020-08-13 15:21:52.678 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.context.properties.ConfigurationBeanFactoryMetadata'
2020-08-13 15:21:52.678 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration'
2020-08-13 15:21:52.678 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'servletExposeExcludePropertyEndpointFilter'
2020-08-13 15:21:52.678 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'servletExposeExcludePropertyEndpointFilter' via factory method to bean named 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.679 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration'
2020-08-13 15:21:52.679 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'webEndpointServletHandlerMapping'
2020-08-13 15:21:52.680 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'management.endpoints.web.cors-org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'webEndpointDiscoverer'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'servletEndpointDiscoverer'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'controllerEndpointDiscoverer'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'endpointMediaTypes'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'management.endpoints.web.cors-org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.683 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'webEndpointServletHandlerMapping' via factory method to bean named 'environment'
2020-08-13 15:21:52.685  INFO 13912 --- [           main] o.s.b.a.e.w.EndpointLinksResolver        : Exposing 15 endpoint(s) beneath base path '/actuator'
2020-08-13 15:21:52.693 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'controllerEndpointHandlerMapping'
2020-08-13 15:21:52.694 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'controllerEndpointHandlerMapping' via factory method to bean named 'controllerEndpointDiscoverer'
2020-08-13 15:21:52.694 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'controllerEndpointHandlerMapping' via factory method to bean named 'management.endpoints.web.cors-org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties'
2020-08-13 15:21:52.694 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'controllerEndpointHandlerMapping' via factory method to bean named 'management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties'
2020-08-13 15:21:52.695 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration'
2020-08-13 15:21:52.699 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestMappingHandlerMapping'
2020-08-13 15:21:52.701 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcContentNegotiationManager'
2020-08-13 15:21:52.702 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcConversionService'
2020-08-13 15:21:52.703 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcResourceUrlProvider'
2020-08-13 15:21:52.703 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.703 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.703 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.705 DEBUG 13912 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 1 mappings in 'requestMappingHandlerMapping'
2020-08-13 15:21:52.706 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcPathMatcher'
2020-08-13 15:21:52.706 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcUrlPathHelper'
2020-08-13 15:21:52.706 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'viewControllerHandlerMapping'
2020-08-13 15:21:52.707 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcPathMatcher'
2020-08-13 15:21:52.707 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcUrlPathHelper'
2020-08-13 15:21:52.707 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.707 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'viewControllerHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.708 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'beanNameHandlerMapping'
2020-08-13 15:21:52.708 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beanNameHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.708 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'beanNameHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.709 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'routerFunctionMapping'
2020-08-13 15:21:52.710 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'routerFunctionMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.710 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'routerFunctionMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.711 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'resourceHandlerMapping'
2020-08-13 15:21:52.711 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcUrlPathHelper'
2020-08-13 15:21:52.711 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcPathMatcher'
2020-08-13 15:21:52.711 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.712 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.712 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'resourceHandlerMapping' via factory method to bean named 'mvcResourceUrlProvider'
2020-08-13 15:21:52.712 DEBUG 13912 --- [           main] o.s.w.s.h.SimpleUrlHandlerMapping        : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2020-08-13 15:21:52.713 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'defaultServletHandlerMapping'
2020-08-13 15:21:52.713 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'requestMappingHandlerAdapter'
2020-08-13 15:21:52.713 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcValidator'
2020-08-13 15:21:52.714 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.714 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.714 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'requestMappingHandlerAdapter' via factory method to bean named 'mvcValidator'
2020-08-13 15:21:52.721 DEBUG 13912 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2020-08-13 15:21:52.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerFunctionAdapter'
2020-08-13 15:21:52.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcUriComponentsContributor'
2020-08-13 15:21:52.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcUriComponentsContributor' via factory method to bean named 'mvcConversionService'
2020-08-13 15:21:52.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcUriComponentsContributor' via factory method to bean named 'requestMappingHandlerAdapter'
2020-08-13 15:21:52.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'httpRequestHandlerAdapter'
2020-08-13 15:21:52.722 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'simpleControllerHandlerAdapter'
2020-08-13 15:21:52.723 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerExceptionResolver'
2020-08-13 15:21:52.723 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'mvcViewResolver'
2020-08-13 15:21:52.723 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'mvcViewResolver' via factory method to bean named 'mvcContentNegotiationManager'
2020-08-13 15:21:52.724 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'errorEndpoint'
2020-08-13 15:21:52.724 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'errorEndpoint' via factory method to bean named 'errorAttributes'
2020-08-13 15:21:52.724 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'errorEndpoint' via factory method to bean named 'server-org.springframework.boot.autoconfigure.web.ServerProperties'
2020-08-13 15:21:52.725 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerMapping'
2020-08-13 15:21:52.725 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'handlerAdapter'
2020-08-13 15:21:52.726 DEBUG 13912 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'handlerAdapter' via factory method to bean named 'org.springframework.beans.factory.support.DefaultListableBeanFactory@585513a8'
2020-08-13 15:21:52.727 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Starting beans in phase 2147483646
2020-08-13 15:21:52.731  INFO 13912 --- [           main] o.s.b.w.e.t.TomcatWebServer              : Tomcat started on port(s): 8085 (http) with context path ''
2020-08-13 15:21:52.732 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Successfully started bean 'webServerStartStop'
2020-08-13 15:21:52.732 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Starting beans in phase 2147483647
2020-08-13 15:21:52.732 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Successfully started bean 'webServerGracefulShutdown'
2020-08-13 15:21:52.733 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.liveBeansView.mbeanDomain' in PropertySource 'systemProperties' with value of type String
2020-08-13 15:21:52.735 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Successfully started bean 'webServerStartStop'
2020-08-13 15:21:52.735 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Starting beans in phase 2147483647
2020-08-13 15:21:52.735 DEBUG 13912 --- [           main] o.s.c.s.DefaultLifecycleProcessor        : Successfully started bean 'webServerGracefulShutdown'
2020-08-13 15:21:52.759 DEBUG 13912 --- [           main] ConditionEvaluationReportLoggingListener :


============================
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------

   AopAutoConfiguration matched:
      - @ConditionalOnProperty (spring.aop.auto=true) matched (OnPropertyCondition)

   AopAutoConfiguration.ClassProxyingConfiguration matched:
      - @ConditionalOnMissingClass did not find unwanted class 'org.aspectj.weaver.Advice' (OnClassCondition)
      - @ConditionalOnProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)

   AuditEventsEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.auditevents.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   BeansEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.beans.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   BeansEndpointAutoConfiguration#beansEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.beans.BeansEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   CacheMeterBinderProvidersConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.instrument.binder.MeterBinder' (OnClassCondition)

   CacheMeterBinderProvidersConfiguration.EhCache2CacheMeterBinderProviderConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.cache.ehcache.EhCacheCache', 'net.sf.ehcache.Ehcache' (OnClassCondition)

   CachesEndpointAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.cache.CacheManager' (OnClassCondition)
      - @ConditionalOnAvailableEndpoint no property management.endpoint.caches.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   CachesEndpointAutoConfiguration#cachesEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.cache.CachesEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   CachesEndpointAutoConfiguration#cachesEndpointWebExtension matched:
      - @ConditionalOnBean (types: org.springframework.boot.actuate.cache.CachesEndpoint; SearchStrategy: all) found bean 'cachesEndpoint'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.cache.CachesEndpointWebExtension; SearchStrategy: all) did not find any beans (OnBeanCondition)

   CompositeMeterRegistryAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.instrument.composite.CompositeMeterRegistry' (OnClassCondition)

   ConditionsReportEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.conditions.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   ConditionsReportEndpointAutoConfiguration#conditionsReportEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ConfigurationPropertiesReportEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.configprops.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   ConfigurationPropertiesReportEndpointAutoConfiguration#configurationPropertiesReportEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)
      - @ConditionalOnMissingBean (types: io.r2dbc.spi.ConnectionFactory; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceAutoConfiguration.PooledDataSourceConfiguration matched:
      - AnyNestedCondition 1 matched 1 did not; NestedCondition on DataSourceAutoConfiguration.PooledDataSourceCondition.PooledDataSourceAvailable PooledDataSource found supported DataSource; NestedCondition on DataSourceAutoConfiguration.PooledDataSourceCondition.ExplicitType @ConditionalOnProperty (spring.datasource.type) did not find property 'type' (DataSourceAutoConfiguration.PooledDataSourceCondition)
      - @ConditionalOnMissingBean (types: javax.sql.DataSource,javax.sql.XADataSource; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceConfiguration.Hikari matched:
      - @ConditionalOnClass found required class 'com.zaxxer.hikari.HikariDataSource' (OnClassCondition)
      - @ConditionalOnProperty (spring.datasource.type=com.zaxxer.hikari.HikariDataSource) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: javax.sql.DataSource; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceHealthContributorAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.jdbc.core.JdbcTemplate', 'org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource' (OnClassCondition)
      - @ConditionalOnEnabledHealthIndicator management.health.defaults.enabled is considered true (OnEnabledHealthIndicatorCondition)
      - @ConditionalOnBean (types: javax.sql.DataSource; SearchStrategy: all) found bean 'dataSource' (OnBeanCondition)

   DataSourceHealthContributorAutoConfiguration#dbHealthContributor matched:
      - @ConditionalOnMissingBean (names: dbHealthIndicator,dbHealthContributor; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceJmxConfiguration matched:
      - @ConditionalOnProperty (spring.jmx.enabled=true) matched (OnPropertyCondition)

   DataSourceJmxConfiguration.Hikari matched:
      - @ConditionalOnClass found required class 'com.zaxxer.hikari.HikariDataSource' (OnClassCondition)
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a primary bean from beans 'dataSource' (OnBeanCondition)

   DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration matched:
      - @ConditionalOnClass found required class 'com.zaxxer.hikari.HikariDataSource' (OnClassCondition)

   DataSourcePoolMetricsAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'io.micrometer.core.instrument.MeterRegistry' (OnClassCondition)
      - @ConditionalOnBean (types: javax.sql.DataSource,io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans 'prometheusMeterRegistry', 'dataSource' (OnBeanCondition)

   DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration matched:
      - @ConditionalOnBean (types: org.springframework.boot.jdbc.metadata.DataSourcePoolMetadataProvider; SearchStrategy: all) found bean 'hikariPoolDataSourceMetadataProvider' (OnBeanCondition)

   DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration matched:
      - @ConditionalOnClass found required class 'com.zaxxer.hikari.HikariDataSource' (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.jdbc.core.JdbcTemplate', 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration.DataSourceTransactionManagerConfiguration matched:
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a primary bean from beans 'dataSource' (OnBeanCondition)

   DataSourceTransactionManagerAutoConfiguration.DataSourceTransactionManagerConfiguration#transactionManager matched:
      - @ConditionalOnMissingBean (types: org.springframework.transaction.PlatformTransactionManager; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DiskSpaceHealthContributorAutoConfiguration matched:
      - @ConditionalOnEnabledHealthIndicator management.health.defaults.enabled is considered true (OnEnabledHealthIndicatorCondition)

   DiskSpaceHealthContributorAutoConfiguration#diskSpaceHealthIndicator matched:
      - @ConditionalOnMissingBean (names: diskSpaceHealthIndicator; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DispatcherServletAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   DispatcherServletAutoConfiguration.DispatcherServletConfiguration matched:
      - @ConditionalOnClass found required class 'javax.servlet.ServletRegistration' (OnClassCondition)
      - Default DispatcherServlet did not find dispatcher servlet beans (DispatcherServletAutoConfiguration.DefaultDispatcherServletCondition)

   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration matched:
      - @ConditionalOnClass found required class 'javax.servlet.ServletRegistration' (OnClassCondition)
      - DispatcherServlet Registration did not find servlet registration bean (DispatcherServletAutoConfiguration.DispatcherServletRegistrationCondition)

   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration#dispatcherServletRegistration matched:
      - @ConditionalOnBean (names: dispatcherServlet types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet' (OnBeanCondition)

   EhCacheCacheConfiguration matched:
      - @ConditionalOnClass found required classes 'net.sf.ehcache.Cache', 'org.springframework.cache.ehcache.EhCacheCacheManager' (OnClassCondition)
      - Cache org.springframework.boot.autoconfigure.cache.EhCacheCacheConfiguration automatic cache type (CacheCondition)
      - ResourceCondition (EhCache) found property spring.cache.ehcache.config (EhCacheCacheConfiguration.ConfigAvailableCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration matched:
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration matched:
      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol' (OnClassCondition)

   EndpointAutoConfiguration#endpointCachingOperationInvokerAdvisor matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.invoker.cache.CachingOperationInvokerAdvisor; SearchStrategy: all) did not find any beans (OnBeanCondition)

   EndpointAutoConfiguration#endpointOperationParameterMapper matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.invoke.ParameterValueMapper; SearchStrategy: all) did not find any beans (OnBeanCondition)

   EnvironmentEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.env.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   EnvironmentEndpointAutoConfiguration#environmentEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.env.EnvironmentEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   EnvironmentEndpointAutoConfiguration#environmentEndpointWebExtension matched:
      - @ConditionalOnBean (types: org.springframework.boot.actuate.env.EnvironmentEndpoint; SearchStrategy: all) found bean 'environmentEndpoint'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.env.EnvironmentEndpointWebExtension; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ErrorMvcAutoConfiguration#basicErrorController matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorController; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration#errorAttributes matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorAttributes; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration#conventionErrorViewResolver matched:
      - @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration matched:
      - @ConditionalOnProperty (server.error.whitelabel.enabled) matched (OnPropertyCondition)
      - ErrorTemplate Missing did not find error template view (ErrorMvcAutoConfiguration.ErrorTemplateMissingCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#beanNameViewResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#defaultErrorView matched:
      - @ConditionalOnMissingBean (names: error; SearchStrategy: all) did not find any beans (OnBeanCondition)

   GenericCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration automatic cache type (CacheCondition)

   HealthContributorAutoConfiguration#pingHealthContributor matched:
      - @ConditionalOnEnabledHealthIndicator management.health.defaults.enabled is considered true (OnEnabledHealthIndicatorCondition)

   HealthEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.health.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   HealthEndpointConfiguration#healthContributorRegistry matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthContributorRegistry; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HealthEndpointConfiguration#healthEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HealthEndpointConfiguration#healthEndpointGroups matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthEndpointGroups; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HealthEndpointConfiguration#healthHttpCodeStatusMapper matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HttpCodeStatusMapper; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HealthEndpointConfiguration#healthStatusAggregator matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.StatusAggregator; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HealthEndpointWebExtensionConfiguration matched:
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnBean (types: org.springframework.boot.actuate.health.HealthEndpoint; SearchStrategy: all) found bean 'healthEndpoint' (OnBeanCondition)

   HealthEndpointWebExtensionConfiguration#healthEndpointWebExtension matched:
      - @ConditionalOnBean (types: org.springframework.boot.actuate.health.HealthEndpoint; SearchStrategy: all) found bean 'healthEndpoint'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthEndpointWebExtension; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HeapDumpWebEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.heapdump.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   HeapDumpWebEndpointAutoConfiguration#heapDumpWebEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.management.HeapDumpWebEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpClientMetricsAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry' (OnClassCondition)
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry' (OnBeanCondition)

   HttpEncodingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.filter.CharacterEncodingFilter' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (server.servlet.encoding.enabled) matched (OnPropertyCondition)

   HttpEncodingAutoConfiguration#characterEncodingFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.CharacterEncodingFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.HttpMessageConverter' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition)

   HttpMessageConvertersAutoConfiguration#messageConverters matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.http.HttpMessageConverters; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.StringHttpMessageConverter' (OnClassCondition)

   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration#stringHttpMessageConverter matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.StringHttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpTraceEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.httptrace.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   InfoContributorAutoConfiguration#envInfoContributor matched:
      - @ConditionalOnEnabledInfoContributor management.info.defaults.enabled is considered true (OnEnabledInfoContributorCondition)

   InfoEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.info.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   InfoEndpointAutoConfiguration#infoEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.info.InfoEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)

   JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration#jacksonObjectMapperBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.Jackson2ObjectMapperBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration.JacksonObjectMapperConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperConfiguration#jacksonObjectMapper matched:
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration.ParameterNamesModuleConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.module.paramnames.ParameterNamesModule' (OnClassCondition)

   JacksonAutoConfiguration.ParameterNamesModuleConfiguration#parameterNamesModule matched:
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.module.paramnames.ParameterNamesModule; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)
      - @ConditionalOnProperty (spring.mvc.converters.preferred-json-mapper=jackson) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) found bean 'jacksonObjectMapper' (OnBeanCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration#mappingJackson2HttpMessageConverter matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.MappingJackson2HttpMessageConverter ignored: org.springframework.hateoas.server.mvc.TypeConstrainedMappingJackson2HttpMessageConverter,org.springframework.data.rest.webmvc.alps.AlpsJsonHttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JdbcTemplateAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.core.JdbcTemplate' (OnClassCondition)
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a primary bean from beans 'dataSource' (OnBeanCondition)

   JdbcTemplateConfiguration matched:
      - @ConditionalOnMissingBean (types: org.springframework.jdbc.core.JdbcOperations; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JmxAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.jmx.export.MBeanExporter' (OnClassCondition)
      - @ConditionalOnProperty (spring.jmx.enabled=true) matched (OnPropertyCondition)

   JmxAutoConfiguration#mbeanExporter matched:
      - @ConditionalOnMissingBean (types: org.springframework.jmx.export.MBeanExporter; SearchStrategy: current) did not find any beans (OnBeanCondition)

   JmxAutoConfiguration#mbeanServer matched:
      - @ConditionalOnMissingBean (types: javax.management.MBeanServer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JmxAutoConfiguration#objectNamingStrategy matched:
      - @ConditionalOnMissingBean (types: org.springframework.jmx.export.naming.ObjectNamingStrategy; SearchStrategy: current) did not find any beans (OnBeanCondition)

   JmxEndpointAutoConfiguration matched:
      - @ConditionalOnProperty (spring.jmx.enabled=true) matched (OnPropertyCondition)

   JmxEndpointAutoConfiguration#jmxAnnotationEndpointDiscoverer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.jmx.JmxEndpointsSupplier; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JmxEndpointAutoConfiguration#jmxMBeanExporter matched:
      - @ConditionalOnSingleCandidate (types: javax.management.MBeanServer; SearchStrategy: all) found a primary bean from beans 'mbeanServer' (OnBeanCondition)

   JvmMetricsAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry' (OnClassCondition)
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry' (OnBeanCondition)

   JvmMetricsAutoConfiguration#classLoaderMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.ClassLoaderMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JvmMetricsAutoConfiguration#jvmGcMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmGcMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JvmMetricsAutoConfiguration#jvmMemoryMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmMemoryMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JvmMetricsAutoConfiguration#jvmThreadMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LegacyHealthEndpointCompatibilityConfiguration#healthAggregator matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthAggregator; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LegacyHealthEndpointCompatibilityConfiguration#healthIndicatorRegistry matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.health.HealthIndicatorRegistry; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LifecycleAutoConfiguration#defaultLifecycleProcessor matched:
      - @ConditionalOnMissingBean (names: lifecycleProcessor; SearchStrategy: current) did not find any beans (OnBeanCondition)

   Log4J2MetricsAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'io.micrometer.core.instrument.binder.logging.Log4j2Metrics', 'org.apache.logging.log4j.LogManager', 'org.apache.logging.log4j.core.LoggerContext' (OnClassCondition)
      - LoggerContext was an instance of org.apache.logging.log4j.core.LoggerContext (Log4J2MetricsAutoConfiguration.Log4JCoreLoggerContextCondition)
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry' (OnBeanCondition)

   Log4J2MetricsAutoConfiguration#log4j2Metrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.logging.Log4j2Metrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LogFileWebEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.logfile.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   LoggersEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.loggers.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   LoggersEndpointAutoConfiguration#loggersEndpoint matched:
      - Logging System enabled (LoggersEndpointAutoConfiguration.OnEnabledLoggingSystemCondition)
      - @ConditionalOnBean (types: org.springframework.boot.logging.LoggingSystem; SearchStrategy: all) found bean 'springBootLoggingSystem'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.logging.LoggersEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ManagementContextAutoConfiguration.DifferentManagementContextConfiguration matched:
      - Management Port actual port type (DIFFERENT) matched required type (OnManagementPortCondition)

   MappingsEndpointAutoConfiguration#mappingsEndpoint matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.mappings.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   MappingsEndpointAutoConfiguration.ServletWebConfiguration matched:
      - found 'session' scope (OnWebApplicationCondition)

   MappingsEndpointAutoConfiguration.ServletWebConfiguration.SpringMvcConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet' (OnBeanCondition)

   MetricsAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.annotation.Timed' (OnClassCondition)

   MetricsAutoConfiguration#micrometerClock matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.Clock; SearchStrategy: all) did not find any beans (OnBeanCondition)

   MetricsEndpointAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.annotation.Timed' (OnClassCondition)
      - @ConditionalOnAvailableEndpoint no property management.endpoint.metrics.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   MetricsEndpointAutoConfiguration#metricsEndpoint matched:
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry'; @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.MetricsEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   MultipartAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.springframework.web.multipart.support.StandardServletMultipartResolver', 'javax.servlet.MultipartConfigElement' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (spring.servlet.multipart.enabled) matched (OnPropertyCondition)

   MultipartAutoConfiguration#multipartConfigElement matched:
      - @ConditionalOnMissingBean (types: javax.servlet.MultipartConfigElement,org.springframework.web.multipart.commons.CommonsMultipartResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   MultipartAutoConfiguration#multipartResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   NamedParameterJdbcTemplateConfiguration matched:
      - @ConditionalOnSingleCandidate (types: org.springframework.jdbc.core.JdbcTemplate; SearchStrategy: all) found a primary bean from beans 'jdbcTemplate'; @ConditionalOnMissingBean (types: org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations; SearchStrategy: all) did not find any beans (OnBeanCondition)

   NoOpCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration automatic cache type (CacheCondition)

   PersistenceExceptionTranslationAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor' (OnClassCondition)

   PersistenceExceptionTranslationAutoConfiguration#persistenceExceptionTranslationPostProcessor matched:
      - @ConditionalOnProperty (spring.dao.exceptiontranslation.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor; SearchStrategy: all) did not find any beans (OnBeanCondition)

   PrometheusMetricsExportAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.prometheus.PrometheusMeterRegistry' (OnClassCondition)
      - @ConditionalOnProperty (management.metrics.export.prometheus.enabled=true) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: io.micrometer.core.instrument.Clock; SearchStrategy: all) found bean 'micrometerClock' (OnBeanCondition)

   PrometheusMetricsExportAutoConfiguration#collectorRegistry matched:
      - @ConditionalOnMissingBean (types: io.prometheus.client.CollectorRegistry; SearchStrategy: all) did not find any beans (OnBeanCondition)

   PrometheusMetricsExportAutoConfiguration#prometheusConfig matched:
      - @ConditionalOnMissingBean (types: io.micrometer.prometheus.PrometheusConfig; SearchStrategy: all) did not find any beans (OnBeanCondition)

   PrometheusMetricsExportAutoConfiguration#prometheusMeterRegistry matched:
      - @ConditionalOnMissingBean (types: io.micrometer.prometheus.PrometheusMeterRegistry; SearchStrategy: all) did not find any beans (OnBeanCondition)

   PrometheusMetricsExportAutoConfiguration.PrometheusScrapeEndpointConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.prometheus.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   PrometheusMetricsExportAutoConfiguration.PrometheusScrapeEndpointConfiguration#prometheusEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.export.prometheus.PrometheusScrapeEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   PropertyPlaceholderAutoConfiguration#propertySourcesPlaceholderConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springframework.context.support.PropertySourcesPlaceholderConfigurer; SearchStrategy: current) did not find any beans (OnBeanCondition)

   RestTemplateAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on RestTemplateAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (RestTemplateAutoConfiguration.NotReactiveWebApplicationCondition)

   RestTemplateAutoConfiguration#restTemplateBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   RestTemplateMetricsConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate' (OnClassCondition)
      - @ConditionalOnBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) found bean 'restTemplateBuilder' (OnBeanCondition)

   RestTemplateMetricsConfiguration#restTemplateExchangeTagsProvider matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.web.client.RestTemplateExchangeTagsProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ScheduledTasksEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.scheduledtasks.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   ScheduledTasksEndpointAutoConfiguration#scheduledTasksEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.scheduling.ScheduledTasksEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ServletManagementContextAutoConfiguration matched:
      - @ConditionalOnClass found required class 'javax.servlet.Servlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ServletWebServerFactoryAutoConfiguration matched:
      - @ConditionalOnClass found required class 'javax.servlet.ServletRequest' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ServletWebServerFactoryAutoConfiguration#tomcatServletWebServerFactoryCustomizer matched:
      - @ConditionalOnClass found required class 'org.apache.catalina.startup.Tomcat' (OnClassCondition)

   ServletWebServerFactoryConfiguration.EmbeddedTomcat matched:
      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol' (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.server.ServletWebServerFactory; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ShutdownEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.shutdown.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   ShutdownEndpointAutoConfiguration#shutdownEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.context.ShutdownEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SimpleCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration automatic cache type (CacheCondition)

   SpringApplicationAdminJmxAutoConfiguration matched:
      - @ConditionalOnProperty (spring.application.admin.enabled=true) matched (OnPropertyCondition)

   SpringApplicationAdminJmxAutoConfiguration#springApplicationAdminRegistrar matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SystemMetricsAutoConfiguration matched:
      - @ConditionalOnClass found required class 'io.micrometer.core.instrument.MeterRegistry' (OnClassCondition)
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry' (OnBeanCondition)

   SystemMetricsAutoConfiguration#fileDescriptorMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.system.FileDescriptorMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SystemMetricsAutoConfiguration#processorMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.system.ProcessorMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SystemMetricsAutoConfiguration#uptimeMetrics matched:
      - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.system.UptimeMetrics; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskExecutionAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor' (OnClassCondition)

   TaskExecutionAutoConfiguration#applicationTaskExecutor matched:
      - @ConditionalOnMissingBean (types: java.util.concurrent.Executor; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskExecutionAutoConfiguration#taskExecutorBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.TaskExecutorBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskSchedulingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler' (OnClassCondition)

   TaskSchedulingAutoConfiguration#taskSchedulerBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.TaskSchedulerBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ThreadDumpEndpointAutoConfiguration matched:
      - @ConditionalOnAvailableEndpoint no property management.endpoint.threaddump.enabled found so using user defined default from management.endpoints.enabled-by-default; @ConditionalOnAvailableEndpoint marked as exposed by a 'management.endpoints.jmx.exposure' property (OnAvailableEndpointCondition)

   ThreadDumpEndpointAutoConfiguration#dumpEndpoint matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.management.ThreadDumpEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TomcatMetricsAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'io.micrometer.core.instrument.binder.tomcat.TomcatMetrics', 'org.apache.catalina.Manager' (OnClassCondition)
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)

   TomcatMetricsAutoConfiguration#tomcatMetricsBinder matched:
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry'; @ConditionalOnMissingBean (types: io.micrometer.core.instrument.binder.tomcat.TomcatMetrics,org.springframework.boot.actuate.metrics.web.tomcat.TomcatMetricsBinder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

   TransactionAutoConfiguration#platformTransactionManagerCustomizers matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration.EnableTransactionManagementConfiguration matched:
      - @ConditionalOnBean (types: org.springframework.transaction.TransactionManager; SearchStrategy: all) found bean 'transactionManager'; @ConditionalOnMissingBean (types: org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration matched:
      - @ConditionalOnProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)

   TransactionAutoConfiguration.TransactionTemplateConfiguration matched:
      - @ConditionalOnSingleCandidate (types: org.springframework.transaction.PlatformTransactionManager; SearchStrategy: all) found a primary bean from beans 'transactionManager' (OnBeanCondition)

   TransactionAutoConfiguration.TransactionTemplateConfiguration#transactionTemplate matched:
      - @ConditionalOnMissingBean (types: org.springframework.transaction.support.TransactionOperations; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebEndpointAutoConfiguration matched:
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)

   WebEndpointAutoConfiguration#controllerEndpointDiscoverer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpointsSupplier; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebEndpointAutoConfiguration#endpointMediaTypes matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebEndpointAutoConfiguration#pathMappedEndpoints matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.PathMappedEndpoints; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebEndpointAutoConfiguration#webEndpointDiscoverer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.WebEndpointsSupplier; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebEndpointAutoConfiguration.WebEndpointServletConfiguration matched:
      - found 'session' scope (OnWebApplicationCondition)

   WebEndpointAutoConfiguration.WebEndpointServletConfiguration#servletEndpointDiscoverer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.endpoint.web.annotation.ServletEndpointsSupplier; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet', 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration#formContentFilter matched:
      - @ConditionalOnProperty (spring.mvc.formcontent.filter.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.FormContentFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#defaultViewResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.InternalResourceViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#requestContextFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.context.request.RequestContextListener,org.springframework.web.filter.RequestContextFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#viewResolver matched:
      - @ConditionalOnBean (types: org.springframework.web.servlet.ViewResolver; SearchStrategy: all) found beans 'defaultViewResolver', 'beanNameViewResolver', 'mvcViewResolver'; @ConditionalOnMissingBean (names: viewResolver types: org.springframework.web.servlet.view.ContentNegotiatingViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcMetricsAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found bean 'prometheusMeterRegistry' (OnBeanCondition)

   WebMvcMetricsAutoConfiguration#webMvcTagsProvider matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.metrics.web.servlet.WebMvcTagsProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebSocketServletAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.servlet.Servlet', 'javax.websocket.server.ServerContainer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration matched:
      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.tomcat.websocket.server.WsSci' (OnClassCondition)

   WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration#websocketServletWebServerCustomizer matched:
      - @ConditionalOnMissingBean (names: websocketServletWebServerCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)


Negative matches:
-----------------

   ActiveMQAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.jms.ConnectionFactory' (OnClassCondition)

   AopAutoConfiguration.AspectJAutoProxyingConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.aspectj.weaver.Advice' (OnClassCondition)

   AppOpticsMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.appoptics.AppOpticsMeterRegistry' (OnClassCondition)

   ArtemisAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.jms.ConnectionFactory' (OnClassCondition)

   AtlasMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.atlas.AtlasMeterRegistry' (OnClassCondition)

   AuditAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.boot.actuate.audit.AuditEventRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.audit.AuditEventRepository (OnBeanCondition)
      Matched:
         - @ConditionalOnProperty (management.auditevents.enabled) matched (OnPropertyCondition)

   AuditEventsEndpointAutoConfiguration#auditEventsEndpoint:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.boot.actuate.audit.AuditEventRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.audit.AuditEventRepository (OnBeanCondition)

   AvailabilityHealthContributorAutoConfiguration#livenessStateHealthIndicator:
      Did not match:
         - @ConditionalOnProperty (management.health.livenessstate.enabled=true) did not find property 'enabled' (OnPropertyCondition)

   AvailabilityHealthContributorAutoConfiguration#readinessStateHealthIndicator:
      Did not match:
         - @ConditionalOnProperty (management.health.readinessstate.enabled=true) did not find property 'enabled' (OnPropertyCondition)

   AvailabilityProbesAutoConfiguration:
      Did not match:
         - Probes availability not running on a supported cloud platform (AvailabilityProbesAutoConfiguration.ProbesCondition)

   BatchAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.batch.core.launch.JobLauncher' (OnClassCondition)

   CacheAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.cache.interceptor.CacheAspectSupport; SearchStrategy: all) did not find any beans of type org.springframework.cache.interceptor.CacheAspectSupport (OnBeanCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.cache.CacheManager' (OnClassCondition)

   CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)
         - Ancestor org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)

   CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.github.benmanes.caffeine.cache.Cache' (OnClassCondition)

   CacheMeterBinderProvidersConfiguration.HazelcastCacheMeterBinderProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'com.hazelcast.spring.cache.HazelcastCache', 'com.hazelcast.core.Hazelcast' (OnClassCondition)

   CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.cache.CacheManager' (OnClassCondition)

   CacheMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.cache.CacheManager; SearchStrategy: all) did not find any beans of type org.springframework.cache.CacheManager (OnBeanCondition)

   CaffeineCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.github.benmanes.caffeine.cache.Caffeine' (OnClassCondition)

   CassandraAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.cassandra.ReactiveSession' (OnClassCondition)

   CassandraRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   ClientHttpConnectorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   CloudFoundryActuatorAutoConfiguration:
      Did not match:
         - @ConditionalOnCloudPlatform did not find CLOUD_FOUNDRY (OnCloudPlatformCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
         - found 'session' scope (OnWebApplicationCondition)
         - @ConditionalOnProperty (management.cloudfoundry.enabled) matched (OnPropertyCondition)

   CodecsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   CompositeMeterRegistryConfiguration:
      Did not match:
         - NoneNestedConditions 1 matched 1 did not; NestedCondition on CompositeMeterRegistryConfiguration.MultipleNonPrimaryMeterRegistriesCondition.SingleInjectableMeterRegistry @ConditionalOnSingleCandidate (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found a primary bean from beans 'prometheusMeterRegistry'; NestedCondition on CompositeMeterRegistryConfiguration.MultipleNonPrimaryMeterRegistriesCondition.NoMeterRegistryCondition @ConditionalOnMissingBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans of type 'io.micrometer.core.instrument.MeterRegistry' prometheusMeterRegistry (CompositeMeterRegistryConfiguration.MultipleNonPrimaryMeterRegistriesCondition)

   ConnectionFactoryHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   ConnectionPoolMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.pool.ConnectionPool' (OnClassCondition)

   CouchbaseAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket' (OnClassCondition)

   CouchbaseHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseReactiveHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket' (OnClassCondition)

   DataSourceAutoConfiguration.EmbeddedDatabaseConfiguration:
      Did not match:
         - EmbeddedDataSource found supported pooled data source (DataSourceAutoConfiguration.EmbeddedDatabaseCondition)

   DataSourceConfiguration.Dbcp2:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.commons.dbcp2.BasicDataSource' (OnClassCondition)

   DataSourceConfiguration.Generic:
      Did not match:
         - @ConditionalOnProperty (spring.datasource.type) did not find property 'spring.datasource.type' (OnPropertyCondition)

   DataSourceConfiguration.Tomcat:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.tomcat.jdbc.pool.DataSource' (OnClassCondition)

   DataSourceJmxConfiguration.TomcatDataSourceJmxConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.tomcat.jdbc.pool.DataSourceProxy' (OnClassCondition)

   DataSourcePoolMetadataProvidersConfiguration.CommonsDbcp2PoolDataSourceMetadataProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.commons.dbcp2.BasicDataSource' (OnClassCondition)

   DataSourcePoolMetadataProvidersConfiguration.TomcatDataSourcePoolMetadataProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.tomcat.jdbc.pool.DataSource' (OnClassCondition)

   DatadogMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.datadog.DatadogMeterRegistry' (OnClassCondition)

   DispatcherServletAutoConfiguration.DispatcherServletConfiguration#multipartResolver:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans of type org.springframework.web.multipart.MultipartResolver (OnBeanCondition)

   DynatraceMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.dynatrace.DynatraceMeterRegistry' (OnClassCondition)

   ElasticMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.elastic.ElasticMeterRegistry' (OnClassCondition)

   ElasticSearchReactiveHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ElasticSearchRestHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.elasticsearch.client.RestClient' (OnClassCondition)

   ElasticsearchDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.core.ElasticsearchTemplate' (OnClassCondition)

   ElasticsearchRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.elasticsearch.client.Client' (OnClassCondition)

   ElasticsearchRestClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.elasticsearch.client.RestClient' (OnClassCondition)

   EmbeddedLdapAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.unboundid.ldap.listener.InMemoryDirectoryServer' (OnClassCondition)

   EmbeddedMongoAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.MongoClientSettings' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.JettyWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.netty.http.server.HttpServer' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.UndertowWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

   ErrorWebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   FlywayAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway' (OnClassCondition)

   FlywayEndpointAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway' (OnClassCondition)

   FreeMarkerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'freemarker.template.Configuration' (OnClassCondition)

   GangliaMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.ganglia.GangliaMeterRegistry' (OnClassCondition)

   GraphiteMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.graphite.GraphiteMeterRegistry' (OnClassCondition)

   GroovyTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'groovy.text.markup.MarkupTemplateEngine' (OnClassCondition)

   GsonAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

   GsonHttpMessageConvertersConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

   H2ConsoleAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.h2.console.enabled=true) did not find property 'enabled' (OnPropertyCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.h2.server.web.WebServlet' (OnClassCondition)
         - found 'session' scope (OnWebApplicationCondition)

   HazelcastAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastJpaDependencyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HealthEndpointReactiveWebExtensionConfiguration:
      Did not match:
         - did not find reactive web application classes (OnWebApplicationCondition)

   HibernateJpaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.persistence.EntityManager' (OnClassCondition)

   HibernateMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.persistence.EntityManagerFactory' (OnClassCondition)

   HttpHandlerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler' (OnClassCondition)

   HttpTraceAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.boot.actuate.trace.http.HttpTraceRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.trace.http.HttpTraceRepository (OnBeanCondition)
      Matched:
         - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
         - @ConditionalOnProperty (management.trace.http.enabled) matched (OnPropertyCondition)

   HttpTraceAutoConfiguration.ReactiveTraceFilterConfiguration:
      Did not match:
         - did not find reactive web application classes (OnWebApplicationCondition)
         - Ancestor org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)

   HttpTraceAutoConfiguration.ServletTraceFilterConfiguration:
      Did not match:
         - Ancestor org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)
      Matched:
         - found 'session' scope (OnWebApplicationCondition)

   HttpTraceEndpointAutoConfiguration#httpTraceEndpoint:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.boot.actuate.trace.http.HttpTraceRepository; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.trace.http.HttpTraceRepository (OnBeanCondition)

   HumioMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.humio.HumioMeterRegistry' (OnClassCondition)

   HypermediaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.hateoas.EntityModel' (OnClassCondition)

   InfinispanCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager' (OnClassCondition)

   InfluxDbAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.influxdb.InfluxDB' (OnClassCondition)

   InfluxDbHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.influxdb.InfluxDB' (OnClassCondition)

   InfluxMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.influx.InfluxMeterRegistry' (OnClassCondition)

   InfoContributorAutoConfiguration#buildInfoContributor:
      Did not match:
         - @ConditionalOnSingleCandidate (types: org.springframework.boot.info.BuildProperties; SearchStrategy: all) did not find any beans (OnBeanCondition)
      Matched:
         - @ConditionalOnEnabledInfoContributor management.info.defaults.enabled is considered true (OnEnabledInfoContributorCondition)

   InfoContributorAutoConfiguration#gitInfoContributor:
      Did not match:
         - @ConditionalOnSingleCandidate (types: org.springframework.boot.info.GitProperties; SearchStrategy: all) did not find any beans (OnBeanCondition)
      Matched:
         - @ConditionalOnEnabledInfoContributor management.info.defaults.enabled is considered true (OnEnabledInfoContributorCondition)

   IntegrationAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.integration.config.EnableIntegration' (OnClassCondition)

   IntegrationGraphEndpointAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.integration.graph.IntegrationGraphServer' (OnClassCondition)

   JCacheCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.cache.Caching' (OnClassCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.fasterxml.jackson.dataformat.xml.XmlMapper' (OnClassCondition)

   JdbcRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration' (OnClassCondition)

   JerseyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.spring.SpringComponentProvider' (OnClassCondition)

   JerseyServerMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.jersey2.server.MetricsApplicationEventListener' (OnClassCondition)

   JettyMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.eclipse.jetty.server.Server' (OnClassCondition)

   JmsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.jms.Message' (OnClassCondition)

   JmsHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.jms.ConnectionFactory' (OnClassCondition)

   JmxMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.jmx.JmxMeterRegistry' (OnClassCondition)

   JndiConnectionFactoryAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jms.core.JmsTemplate' (OnClassCondition)

   JndiDataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.datasource.jndi-name) did not find property 'jndi-name' (OnPropertyCondition)
      Matched:
         - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)

   JolokiaEndpointAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.jolokia.http.AgentServlet' (OnClassCondition)

   JooqAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.jooq.DSLContext' (OnClassCondition)

   JpaRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.jpa.repository.JpaRepository' (OnClassCondition)

   JsonbAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.json.bind.Jsonb' (OnClassCondition)

   JsonbHttpMessageConvertersConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.json.bind.Jsonb' (OnClassCondition)

   JtaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.transaction.Transaction' (OnClassCondition)

   KafkaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.kafka.core.KafkaTemplate' (OnClassCondition)

   KafkaMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.kafka.core.ProducerFactory' (OnClassCondition)

   KairosMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.kairos.KairosMeterRegistry' (OnClassCondition)

   LdapAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ldap.core.ContextSource' (OnClassCondition)

   LdapHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ldap.core.LdapOperations' (OnClassCondition)

   LdapRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.ldap.repository.LdapRepository' (OnClassCondition)

   LegacyHealthEndpointAdaptersConfiguration#healthAggregatorStatusAggregatorAdapter:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.boot.actuate.health.HealthAggregator; SearchStrategy: all) did not find any beans of type org.springframework.boot.actuate.health.HealthAggregator (OnBeanCondition)

   LegacyHealthEndpointCompatibilityConfiguration.LegacyReactiveHealthEndpointCompatibilityConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Mono' (OnClassCondition)

   LiquibaseAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'liquibase.change.DatabaseChange' (OnClassCondition)

   LiquibaseEndpointAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'liquibase.integration.spring.SpringLiquibase' (OnClassCondition)

   LogFileWebEndpointAutoConfiguration#logFileWebEndpoint:
      Did not match:
         - Log File did not find logging file (LogFileWebEndpointAutoConfiguration.LogFileCondition)

   LogbackMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'ch.qos.logback.classic.LoggerContext' (OnClassCondition)

   MailHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.mail.javamail.JavaMailSenderImpl; SearchStrategy: all) did not find any beans of type org.springframework.mail.javamail.JavaMailSenderImpl (OnBeanCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.mail.javamail.JavaMailSenderImpl' (OnClassCondition)
         - @ConditionalOnEnabledHealthIndicator management.health.defaults.enabled is considered true (OnEnabledHealthIndicatorCondition)

   MailSenderAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.activation.MimeType' (OnClassCondition)

   MailSenderValidatorAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.mail.test-connection) did not find property 'test-connection' (OnPropertyCondition)

   ManagementContextAutoConfiguration.SameManagementContextConfiguration:
      Did not match:
         - Management Port actual port type (DIFFERENT) did not match required type (SAME) (OnManagementPortCondition)

   ManagementWebSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter' (OnClassCondition)

   MappingsEndpointAutoConfiguration.ReactiveWebConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler' (OnClassCondition)

   MessageSourceAutoConfiguration:
      Did not match:
         - ResourceBundle did not find bundle with basename messages (MessageSourceAutoConfiguration.ResourceBundleCondition)

   MongoAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MongoDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MongoHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.mongodb.core.MongoTemplate' (OnClassCondition)

   MongoReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoReactiveHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   MongoReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MustacheAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.samskivert.mustache.Mustache' (OnClassCondition)

   Neo4jDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.ogm.session.SessionFactory' (OnClassCondition)

   Neo4jHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.ogm.session.SessionFactory' (OnClassCondition)

   Neo4jRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.ogm.session.Neo4jSession' (OnClassCondition)

   NewRelicMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.newrelic.NewRelicMeterRegistry' (OnClassCondition)

   NoOpMeterRegistryConfiguration:
      Did not match:
         - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans of type 'io.micrometer.core.instrument.MeterRegistry' prometheusMeterRegistry (OnBeanCondition)

   OAuth2ClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.configuration.EnableWebSecurity' (OnClassCondition)

   OAuth2ResourceServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken' (OnClassCondition)

   ProjectInfoAutoConfiguration#buildProperties:
      Did not match:
         - @ConditionalOnResource did not find resource '${spring.info.build.location:classpath:META-INF/build-info.properties}' (OnResourceCondition)

   ProjectInfoAutoConfiguration#gitProperties:
      Did not match:
         - GitResource did not find git info at classpath:git.properties (ProjectInfoAutoConfiguration.GitResourceAvailableCondition)

   PrometheusMetricsExportAutoConfiguration.PrometheusPushGatewayConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.prometheus.client.exporter.PushGateway' (OnClassCondition)

   QuartzAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.quartz.Scheduler' (OnClassCondition)

   R2dbcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   R2dbcDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.r2dbc.core.DatabaseClient' (OnClassCondition)

   R2dbcRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   R2dbcTransactionManagerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.r2dbc.connectionfactory.R2dbcTransactionManager' (OnClassCondition)

   RSocketMessagingAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.RSocketFactory' (OnClassCondition)

   RSocketRequesterAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.RSocketFactory' (OnClassCondition)

   RSocketSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.rsocket.core.SecuritySocketAcceptorInterceptor' (OnClassCondition)

   RSocketServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.core.RSocketServer' (OnClassCondition)

   RSocketStrategiesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.netty.buffer.PooledByteBufAllocator' (OnClassCondition)

   RabbitAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.rabbitmq.client.Channel' (OnClassCondition)

   RabbitHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.amqp.rabbit.core.RabbitTemplate' (OnClassCondition)

   RabbitMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.rabbitmq.client.ConnectionFactory' (OnClassCondition)

   ReactiveCloudFoundryActuatorAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   ReactiveElasticsearchRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient' (OnClassCondition)

   ReactiveElasticsearchRestClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.netty.http.client.HttpClient' (OnClassCondition)

   ReactiveHealthEndpointConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveManagementContextAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveManagementWebSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity' (OnClassCondition)

   ReactiveOAuth2ClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveOAuth2ResourceServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity' (OnClassCondition)

   ReactiveSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveUserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.ReactiveAuthenticationManager' (OnClassCondition)

   ReactiveWebServerFactoryAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   RedisAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.core.RedisOperations' (OnClassCondition)

   RedisCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.connection.RedisConnectionFactory' (OnClassCondition)

   RedisHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.connection.RedisConnectionFactory' (OnClassCondition)

   RedisReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   RedisReactiveHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   RedisRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.repository.configuration.EnableRedisRepositories' (OnClassCondition)

   RepositoryRestMvcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration' (OnClassCondition)

   Saml2RelyingPartyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository' (OnClassCondition)

   SecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.DefaultAuthenticationEventPublisher' (OnClassCondition)

   SecurityFilterAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.http.SessionCreationPolicy' (OnClassCondition)

   SendGridAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.sendgrid.SendGrid' (OnClassCondition)

   ServletManagementContextAutoConfiguration.ApplicationContextFilterConfiguration:
      Did not match:
         - @ConditionalOnProperty (management.server.add-application-context-header=true) did not find property 'add-application-context-header' (OnPropertyCondition)

   ServletWebServerFactoryAutoConfiguration#forwardedHeaderFilter:
      Did not match:
         - @ConditionalOnProperty (server.forward-headers-strategy=framework) did not find property 'server.forward-headers-strategy' (OnPropertyCondition)

   ServletWebServerFactoryConfiguration.EmbeddedJetty:
      Did not match:
         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.webapp.WebAppContext' (OnClassCondition)

   ServletWebServerFactoryConfiguration.EmbeddedUndertow:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

   SessionAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.session.Session' (OnClassCondition)

   SessionsEndpointAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.session.FindByIndexNameSessionRepository' (OnClassCondition)

   SignalFxMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.signalfx.SignalFxMeterRegistry' (OnClassCondition)

   SimpleMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnMissingBean (types: io.micrometer.core.instrument.MeterRegistry; SearchStrategy: all) found beans of type 'io.micrometer.core.instrument.MeterRegistry' prometheusMeterRegistry (OnBeanCondition)
      Matched:
         - @ConditionalOnProperty (management.metrics.export.simple.enabled=true) matched (OnPropertyCondition)

   SolrAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.solr.client.solrj.impl.CloudSolrClient' (OnClassCondition)

   SolrHealthContributorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.solr.client.solrj.SolrClient' (OnClassCondition)

   SolrRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.solr.client.solrj.SolrClient' (OnClassCondition)

   SpringDataWebAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.web.PageableHandlerMethodArgumentResolver' (OnClassCondition)

   StackdriverMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.stackdriver.StackdriverMeterRegistry' (OnClassCondition)

   StatsdMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.micrometer.statsd.StatsdMeterRegistry' (OnClassCondition)

   TaskSchedulingAutoConfiguration#taskScheduler:
      Did not match:
         - @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor (OnBeanCondition)

   ThymeleafAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.thymeleaf.spring5.SpringTemplateEngine' (OnClassCondition)

   TransactionAutoConfiguration#transactionalOperator:
      Did not match:
         - @ConditionalOnSingleCandidate (types: org.springframework.transaction.ReactiveTransactionManager; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration.EnableTransactionManagementConfiguration.JdkDynamicAutoProxyConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.aop.proxy-target-class=false) found different value in property 'proxy-target-class' (OnPropertyCondition)

   UserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.AuthenticationManager' (OnClassCondition)

   ValidationAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.validation.executable.ExecutableValidator' (OnClassCondition)

   WavefrontMetricsExportAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.wavefront.sdk.common.WavefrontSender' (OnClassCondition)

   WebClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   WebClientMetricsConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   WebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   WebFluxMetricsAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   WebMvcAutoConfiguration#hiddenHttpMethodFilter:
      Did not match:
         - @ConditionalOnProperty (spring.mvc.hiddenmethod.filter.enabled) did not find property 'enabled' (OnPropertyCondition)

   WebMvcAutoConfiguration.ResourceChainCustomizerConfiguration:
      Did not match:
         - @ConditionalOnEnabledResourceChain did not find class org.webjars.WebJarAssetLocator (OnEnabledResourceChainCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#beanNameViewResolver:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) found beans of type 'org.springframework.web.servlet.view.BeanNameViewResolver' beanNameViewResolver (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#localeResolver:
      Did not match:
         - @ConditionalOnProperty (spring.mvc.locale) did not find property 'locale' (OnPropertyCondition)

   WebServiceTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.oxm.Marshaller' (OnClassCondition)

   WebServicesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ws.transport.http.MessageDispatcherServlet' (OnClassCondition)

   WebSocketMessagingAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer' (OnClassCondition)

   WebSocketReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   WebSocketServletAutoConfiguration.JettyWebSocketConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer' (OnClassCondition)

   WebSocketServletAutoConfiguration.UndertowWebSocketConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.undertow.websockets.jsr.Bootstrap' (OnClassCondition)

   XADataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.transaction.TransactionManager' (OnClassCondition)


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration

    org.springframework.boot.actuate.autoconfigure.availability.AvailabilityHealthContributorAutoConfiguration

    org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration

    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration

    org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration

    org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration

    org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration

    org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration

    org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration

    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration

    org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration



2020-08-13 15:21:52.766 DEBUG 13912 --- [           main] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'spring.liveBeansView.mbeanDomain' in PropertySource 'systemProperties' with value of type String
2020-08-13 15:21:52.768  INFO 13912 --- [           main] o.e.s.i.Issue22926ReproducerApplication  : Started Issue22926ReproducerApplication in 2.551 seconds (JVM running for 4.254)
2020-08-13 15:21:53.493 DEBUG 13912 --- [)-192.168.10.73] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'local.server.port' in PropertySource 'server.ports' with value of type Integer
2020-08-13 15:21:54.155 DEBUG 13912 --- [)-192.168.10.73] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'management.endpoints.enabled-by-default' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:54.156 DEBUG 13912 --- [)-192.168.10.73] o.s.c.e.PropertySourcesPropertyResolver  : Found key 'management.endpoints.enabled-by-default' in PropertySource 'configurationProperties' with value of type String
2020-08-13 15:21:54.172 DEBUG 13912 --- [)-192.168.10.73] o.s.j.d.DataSourceUtils                  : Fetching JDBC Connection from DataSource
2020-08-13 15:21:54.172  INFO 13912 --- [)-192.168.10.73] o.a.c.c.C.[.[.[/]                        : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-08-13 15:21:54.172  INFO 13912 --- [)-192.168.10.73] o.s.w.s.DispatcherServlet                : Initializing Servlet 'dispatcherServlet'
2020-08-13 15:21:54.172 DEBUG 13912 --- [)-192.168.10.73] o.s.w.s.DispatcherServlet                : Detected StandardServletMultipartResolver
2020-08-13 15:21:54.172 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : HikariPool-1 - configuration:
2020-08-13 15:21:54.175 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : allowPoolSuspension.............false
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : autoCommit......................true
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : catalog.........................none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : connectionInitSql...............none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : connectionTestQuery.............none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : connectionTimeout...............30000
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : dataSource......................none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : dataSourceClassName.............none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : dataSourceJNDI..................none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : dataSourceProperties............{password=<masked>}
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : driverClassName................."org.h2.Driver"
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : exceptionOverrideClassName......none
2020-08-13 15:21:54.176 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : healthCheckProperties...........{}
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : healthCheckRegistry.............none
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : idleTimeout.....................600000
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : initializationFailTimeout.......1
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : isolateInternalQueries..........false
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : jdbcUrl.........................jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : leakDetectionThreshold..........0
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : maxLifetime.....................1800000
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : maximumPoolSize.................10
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : metricRegistry..................none
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : metricsTrackerFactory...........com.zaxxer.hikari.metrics.micrometer.MicrometerMetricsTrackerFactory@334b99e4
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : minimumIdle.....................10
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : password........................<masked>
2020-08-13 15:21:54.177 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : poolName........................"HikariPool-1"
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : readOnly........................false
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : registerMbeans..................false
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : scheduledExecutor...............none
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : schema..........................none
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : threadFactory...................internal
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : transactionIsolation............default
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : username........................"sa"
2020-08-13 15:21:54.178 DEBUG 13912 --- [)-192.168.10.73] c.z.h.HikariConfig                       : validationTimeout...............5000
2020-08-13 15:21:54.178  INFO 13912 --- [)-192.168.10.73] c.z.h.HikariDataSource                   : HikariPool-1 - Starting...
2020-08-13 15:21:54.180 DEBUG 13912 --- [)-192.168.10.73] o.s.w.s.DispatcherServlet                : enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
2020-08-13 15:21:54.181  INFO 13912 --- [)-192.168.10.73] o.s.w.s.DispatcherServlet                : Completed initialization in 9 ms
2020-08-13 15:21:54.257 DEBUG 13912 --- [)-192.168.10.73] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.264  INFO 13912 --- [)-192.168.10.73] c.z.h.HikariDataSource                   : HikariPool-1 - Start completed.
2020-08-13 15:21:54.274 DEBUG 13912 --- [)-192.168.10.73] o.s.j.d.DataSourceUtils                  : Fetching JDBC Connection from DataSource
2020-08-13 15:21:54.365 DEBUG 13912 --- [l-1 housekeeper] c.z.h.p.HikariPool                       : HikariPool-1 - Pool stats (total=1, active=0, idle=1, waiting=0)
2020-08-13 15:21:54.368 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn1: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.368 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn2: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.368 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn3: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.369 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn4: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.369 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn5: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.369 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn6: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.370 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn7: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.370 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn8: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.370 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - Added connection conn9: url=jdbc:h2:mem:cfd24415-0f0e-4211-9243-d3d0fcd9a34a user=SA
2020-08-13 15:21:54.370 DEBUG 13912 --- [onnection adder] c.z.h.p.HikariPool                       : HikariPool-1 - After adding stats (total=10, active=0, idle=10, waiting=0)
~~~~

http://localhost:8085/actuator/prometheus
~~~~
# HELP jvm_buffer_memory_used_bytes An estimate of the memory that the Java virtual machine is using for this buffer pool
# TYPE jvm_buffer_memory_used_bytes gauge
jvm_buffer_memory_used_bytes{id="mapped",instance="YYY",site="XXX",} 0.0
jvm_buffer_memory_used_bytes{id="direct",instance="YYY",site="XXX",} 8192.0
# HELP jvm_buffer_count_buffers An estimate of the number of buffers in the pool
# TYPE jvm_buffer_count_buffers gauge
jvm_buffer_count_buffers{id="mapped",instance="YYY",site="XXX",} 0.0
jvm_buffer_count_buffers{id="direct",instance="YYY",site="XXX",} 1.0
# HELP jvm_threads_states_threads The current number of threads having NEW state
# TYPE jvm_threads_states_threads gauge
jvm_threads_states_threads{instance="YYY",site="XXX",state="runnable",} 14.0
jvm_threads_states_threads{instance="YYY",site="XXX",state="terminated",} 0.0
jvm_threads_states_threads{instance="YYY",site="XXX",state="new",} 0.0
jvm_threads_states_threads{instance="YYY",site="XXX",state="blocked",} 0.0
jvm_threads_states_threads{instance="YYY",site="XXX",state="waiting",} 22.0
jvm_threads_states_threads{instance="YYY",site="XXX",state="timed-waiting",} 10.0
# HELP process_start_time_seconds Start time of the process since unix epoch.
# TYPE process_start_time_seconds gauge
process_start_time_seconds{instance="YYY",site="XXX",} 1.597328508553E9
# HELP hikaricp_connections_active Active connections
# TYPE hikaricp_connections_active gauge
hikaricp_connections_active{instance="YYY",pool="HikariPool-1",site="XXX",} 0.0
# HELP jvm_gc_memory_promoted_bytes_total Count of positive increases in the size of the old generation memory pool before GC to after GC
# TYPE jvm_gc_memory_promoted_bytes_total counter
jvm_gc_memory_promoted_bytes_total{instance="YYY",site="XXX",} 0.0
# HELP process_uptime_seconds The uptime of the Java virtual machine
# TYPE process_uptime_seconds gauge
process_uptime_seconds{instance="YYY",site="XXX",} 46.286
# HELP jvm_threads_peak_threads The peak live thread count since the Java virtual machine started or peak was reset
# TYPE jvm_threads_peak_threads gauge
jvm_threads_peak_threads{instance="YYY",site="XXX",} 47.0
# HELP jvm_memory_max_bytes The maximum amount of memory in bytes that can be used for memory management
# TYPE jvm_memory_max_bytes gauge
jvm_memory_max_bytes{area="nonheap",id="Metaspace",instance="YYY",site="XXX",} -1.0
jvm_memory_max_bytes{area="nonheap",id="CodeHeap 'profiled nmethods'",instance="YYY",site="XXX",} 1.2288E8
jvm_memory_max_bytes{area="nonheap",id="CodeHeap 'non-profiled nmethods'",instance="YYY",site="XXX",} 1.2288E8
jvm_memory_max_bytes{area="heap",id="G1 Eden Space",instance="YYY",site="XXX",} -1.0
jvm_memory_max_bytes{area="nonheap",id="CodeHeap 'non-nmethods'",instance="YYY",site="XXX",} 5898240.0
jvm_memory_max_bytes{area="heap",id="G1 Survivor Space",instance="YYY",site="XXX",} -1.0
jvm_memory_max_bytes{area="nonheap",id="Compressed Class Space",instance="YYY",site="XXX",} 1.073741824E9
jvm_memory_max_bytes{area="heap",id="G1 Old Gen",instance="YYY",site="XXX",} 8.541700096E9
# HELP jdbc_connections_min Minimum number of idle connections in the pool.
# TYPE jdbc_connections_min gauge
jdbc_connections_min{instance="YYY",name="dataSource",site="XXX",} 10.0
# HELP tomcat_sessions_active_current_sessions
# TYPE tomcat_sessions_active_current_sessions gauge
tomcat_sessions_active_current_sessions{instance="YYY",site="XXX",} 0.0
# HELP tomcat_sessions_alive_max_seconds
# TYPE tomcat_sessions_alive_max_seconds gauge
tomcat_sessions_alive_max_seconds{instance="YYY",site="XXX",} 0.0
# HELP jvm_memory_committed_bytes The amount of memory in bytes that is committed for the Java virtual machine to use
# TYPE jvm_memory_committed_bytes gauge
jvm_memory_committed_bytes{area="nonheap",id="Metaspace",instance="YYY",site="XXX",} 4.9020928E7
jvm_memory_committed_bytes{area="nonheap",id="CodeHeap 'profiled nmethods'",instance="YYY",site="XXX",} 1.5597568E7
jvm_memory_committed_bytes{area="nonheap",id="CodeHeap 'non-profiled nmethods'",instance="YYY",site="XXX",} 2555904.0
jvm_memory_committed_bytes{area="heap",id="G1 Eden Space",instance="YYY",site="XXX",} 1.7825792E8
jvm_memory_committed_bytes{area="nonheap",id="CodeHeap 'non-nmethods'",instance="YYY",site="XXX",} 2555904.0
jvm_memory_committed_bytes{area="heap",id="G1 Survivor Space",instance="YYY",site="XXX",} 1.2582912E7
jvm_memory_committed_bytes{area="nonheap",id="Compressed Class Space",instance="YYY",site="XXX",} 6291456.0
jvm_memory_committed_bytes{area="heap",id="G1 Old Gen",instance="YYY",site="XXX",} 3.43932928E8
# HELP tomcat_sessions_active_max_sessions
# TYPE tomcat_sessions_active_max_sessions gauge
tomcat_sessions_active_max_sessions{instance="YYY",site="XXX",} 0.0
# HELP hikaricp_connections_min Min connections
# TYPE hikaricp_connections_min gauge
hikaricp_connections_min{instance="YYY",pool="HikariPool-1",site="XXX",} 10.0
# HELP jvm_memory_usage_after_gc_percent The percentage of old gen heap used after the last GC event, in the range [0..1]
# TYPE jvm_memory_usage_after_gc_percent gauge
jvm_memory_usage_after_gc_percent{area="heap",generation="old",instance="YYY",site="XXX",} 5.812482227425654E-4
# HELP jvm_classes_unloaded_classes_total The total number of classes unloaded since the Java virtual machine has started execution
# TYPE jvm_classes_unloaded_classes_total counter
jvm_classes_unloaded_classes_total{instance="YYY",site="XXX",} 0.0
# HELP hikaricp_connections_acquire_seconds Connection acquire time
# TYPE hikaricp_connections_acquire_seconds summary
hikaricp_connections_acquire_seconds_count{instance="YYY",pool="HikariPool-1",site="XXX",} 2.0
hikaricp_connections_acquire_seconds_sum{instance="YYY",pool="HikariPool-1",site="XXX",} 6.8E-5
# HELP hikaricp_connections_acquire_seconds_max Connection acquire time
# TYPE hikaricp_connections_acquire_seconds_max gauge
hikaricp_connections_acquire_seconds_max{instance="YYY",pool="HikariPool-1",site="XXX",} 5.24E-5
# HELP system_cpu_count The number of processors available to the Java virtual machine
# TYPE system_cpu_count gauge
system_cpu_count{instance="YYY",site="XXX",} 8.0
# HELP hikaricp_connections_idle Idle connections
# TYPE hikaricp_connections_idle gauge
hikaricp_connections_idle{instance="YYY",pool="HikariPool-1",site="XXX",} 10.0
# HELP log4j2_events_total Number of fatal level log events
# TYPE log4j2_events_total counter
log4j2_events_total{instance="YYY",level="fatal",site="XXX",} 0.0
log4j2_events_total{instance="YYY",level="warn",site="XXX",} 0.0
log4j2_events_total{instance="YYY",level="trace",site="XXX",} 0.0
log4j2_events_total{instance="YYY",level="info",site="XXX",} 18.0
log4j2_events_total{instance="YYY",level="debug",site="XXX",} 542.0
log4j2_events_total{instance="YYY",level="error",site="XXX",} 0.0
# HELP hikaricp_connections_timeout_total Connection timeout total count
# TYPE hikaricp_connections_timeout_total counter
hikaricp_connections_timeout_total{instance="YYY",pool="HikariPool-1",site="XXX",} 0.0
# HELP jvm_threads_live_threads The current number of live threads including both daemon and non-daemon threads
# TYPE jvm_threads_live_threads gauge
jvm_threads_live_threads{instance="YYY",site="XXX",} 46.0
# HELP jvm_buffer_total_capacity_bytes An estimate of the total capacity of the buffers in this pool
# TYPE jvm_buffer_total_capacity_bytes gauge
jvm_buffer_total_capacity_bytes{id="mapped",instance="YYY",site="XXX",} 0.0
jvm_buffer_total_capacity_bytes{id="direct",instance="YYY",site="XXX",} 8192.0
# HELP hikaricp_connections Total connections
# TYPE hikaricp_connections gauge
hikaricp_connections{instance="YYY",pool="HikariPool-1",site="XXX",} 10.0
# HELP jvm_gc_live_data_size_bytes Size of old generation memory pool after a full GC
# TYPE jvm_gc_live_data_size_bytes gauge
jvm_gc_live_data_size_bytes{instance="YYY",site="XXX",} 0.0
# HELP jvm_gc_overhead_percent An approximation of the percent of CPU time used by GC activities over the last lookback period or since monitoring began, whichever is shorter, in the range [0..1]
# TYPE jvm_gc_overhead_percent gauge
jvm_gc_overhead_percent{instance="YYY",site="XXX",} 2.3334518952463132E-4
# HELP jvm_gc_max_data_size_bytes Max size of old generation memory pool
# TYPE jvm_gc_max_data_size_bytes gauge
jvm_gc_max_data_size_bytes{instance="YYY",site="XXX",} 8.541700096E9
# HELP jvm_threads_daemon_threads The current number of live daemon threads
# TYPE jvm_threads_daemon_threads gauge
jvm_threads_daemon_threads{instance="YYY",site="XXX",} 39.0
# HELP hikaricp_connections_pending Pending threads
# TYPE hikaricp_connections_pending gauge
hikaricp_connections_pending{instance="YYY",pool="HikariPool-1",site="XXX",} 0.0
# HELP hikaricp_connections_usage_seconds Connection usage time
# TYPE hikaricp_connections_usage_seconds summary
hikaricp_connections_usage_seconds_count{instance="YYY",pool="HikariPool-1",site="XXX",} 2.0
hikaricp_connections_usage_seconds_sum{instance="YYY",pool="HikariPool-1",site="XXX",} 0.009
# HELP hikaricp_connections_usage_seconds_max Connection usage time
# TYPE hikaricp_connections_usage_seconds_max gauge
hikaricp_connections_usage_seconds_max{instance="YYY",pool="HikariPool-1",site="XXX",} 0.009
# HELP tomcat_sessions_created_sessions_total
# TYPE tomcat_sessions_created_sessions_total counter
tomcat_sessions_created_sessions_total{instance="YYY",site="XXX",} 0.0
# HELP tomcat_sessions_expired_sessions_total
# TYPE tomcat_sessions_expired_sessions_total counter
tomcat_sessions_expired_sessions_total{instance="YYY",site="XXX",} 0.0
# HELP hikaricp_connections_creation_seconds_max Connection creation time
# TYPE hikaricp_connections_creation_seconds_max gauge
hikaricp_connections_creation_seconds_max{instance="YYY",pool="HikariPool-1",site="XXX",} 0.001
# HELP hikaricp_connections_creation_seconds Connection creation time
# TYPE hikaricp_connections_creation_seconds summary
hikaricp_connections_creation_seconds_count{instance="YYY",pool="HikariPool-1",site="XXX",} 9.0
hikaricp_connections_creation_seconds_sum{instance="YYY",pool="HikariPool-1",site="XXX",} 0.001
# HELP jdbc_connections_max Maximum number of active connections that can be allocated at the same time.
# TYPE jdbc_connections_max gauge
jdbc_connections_max{instance="YYY",name="dataSource",site="XXX",} 10.0
# HELP process_cpu_usage The "recent cpu usage" for the Java Virtual Machine process
# TYPE process_cpu_usage gauge
process_cpu_usage{instance="YYY",site="XXX",} 0.07812125017999136
# HELP system_cpu_usage The "recent cpu usage" for the whole system
# TYPE system_cpu_usage gauge
system_cpu_usage{instance="YYY",site="XXX",} 0.43037310168114495
# HELP jvm_memory_used_bytes The amount of used memory
# TYPE jvm_memory_used_bytes gauge
jvm_memory_used_bytes{area="nonheap",id="Metaspace",instance="YYY",site="XXX",} 4.733292E7
jvm_memory_used_bytes{area="nonheap",id="CodeHeap 'profiled nmethods'",instance="YYY",site="XXX",} 1.5586688E7
jvm_memory_used_bytes{area="nonheap",id="CodeHeap 'non-profiled nmethods'",instance="YYY",site="XXX",} 2352640.0
jvm_memory_used_bytes{area="heap",id="G1 Eden Space",instance="YYY",site="XXX",} 1.13246208E8
jvm_memory_used_bytes{area="nonheap",id="CodeHeap 'non-nmethods'",instance="YYY",site="XXX",} 1322624.0
jvm_memory_used_bytes{area="heap",id="G1 Survivor Space",instance="YYY",site="XXX",} 1.2582912E7
jvm_memory_used_bytes{area="nonheap",id="Compressed Class Space",instance="YYY",site="XXX",} 5613952.0
jvm_memory_used_bytes{area="heap",id="G1 Old Gen",instance="YYY",site="XXX",} 2867696.0
# HELP tomcat_sessions_rejected_sessions_total
# TYPE tomcat_sessions_rejected_sessions_total counter
tomcat_sessions_rejected_sessions_total{instance="YYY",site="XXX",} 0.0
# HELP jvm_compilation_time_ms_total The approximate accumulated elapsed time spent in compilation
# TYPE jvm_compilation_time_ms_total counter
jvm_compilation_time_ms_total{compiler="HotSpot 64-Bit Tiered Compilers",instance="YYY",site="XXX",} 6383.0
# HELP jvm_gc_memory_allocated_bytes_total Incremented for an increase in the size of the young generation memory pool after one GC to before the next
# TYPE jvm_gc_memory_allocated_bytes_total counter
jvm_gc_memory_allocated_bytes_total{instance="YYY",site="XXX",} 0.0
# HELP jvm_classes_loaded_classes The number of classes that are currently loaded in the Java virtual machine
# TYPE jvm_classes_loaded_classes gauge
jvm_classes_loaded_classes{instance="YYY",site="XXX",} 9202.0
# HELP hikaricp_connections_max Max connections
# TYPE hikaricp_connections_max gauge
hikaricp_connections_max{instance="YYY",pool="HikariPool-1",site="XXX",} 10.0
~~~~