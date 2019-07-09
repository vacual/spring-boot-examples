> https://juejin.im/post/5aad3351f265da23994e4ce7
> https://juejin.im/post/5c7fedb66fb9a04a10300e68

1. pom.xml
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
	<groupId>io.micrometer</groupId>
	<artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
```

2. springboot2启用/actuator/prometheus端点，供Prometheus来抓取指标。

