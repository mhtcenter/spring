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
