Application framework
1. Create SpringCenterApplication
   a. @SpringBootApplication
   b. @EnableAutoConfiguration
   c. Add main method


1. 创建接口
2. 在interface实现类上标注@Component
3. 在Config类上加注@Configuration和@ComponentScan
默认会扫描该config类以及该Config类所在包的子包，当然也可以指定ComponentScan中的name属性







Issues:
1. 遇到无法使用注解@Autowired的情况，检查发现maven的repository目录下（.m2/springcenter.repository/org/springframework）出现了重复的spring-beans jar包
因为在pom中使用了spring boot，spring boot已经自带了该jar包，所以导致使用失败

解决办法：删除spring-beans等以spring-开头的类库

2.使用注解@ConfigurationProperties(prefix = "spring.datasource.primary")，需要在pom中添加以下依赖
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-configuration-processor</artifactId>
				<optional>true</optional>
			</dependency>


3. Error creating bean with name 'dataSource' defined in class path resource 
在初始化spring容器的过程中，会去默认检测是否存在datasource，那么此时我们需要告诉spring容器我们默认的datasource是哪个
解决办法：添加spring.hk.springcenter.configuration.DataSourceConfig类


Knlowledge:
1. @EnableAutoConfiguration 注解并不等同于@ComponentScan，而@SpringBootApplication注解则包含了上述两个注解
2. @Configuration表示这是一个spring的配置类，并不是spring boot特有.一般将@Configuration和@Bean放一起。
	@Configuration 和 @Bean 注解
		带有 @Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源。@Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象，该对象应该被注册为在 Spring 应用程序上下文中的 bean。最简单可行的 @Configuration 类如下所示：
等价于XML配置文件
3. @Primay注解将会使得spring application使用标注了该注解的bean作为首要注入的bean,但是使用qualifier会更好
4. @RunWith(SpringRunner.class) 告诉JUnit运行使用Spring的测试支持。SpringRunner是SpringJUnit4ClassRunner的新名字，这个名字只是让名字看起来简单些。

