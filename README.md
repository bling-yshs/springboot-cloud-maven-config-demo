# Maven 微服务项目管理配置文件编写

## 父项目

1. 先定义最外层的语法约束

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       
   </project>
   ```

2. 设置一些必要的信息

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       
       <groupId>com.yshs</groupId>
       <artifactId>springboot-cloud-demo</artifactId>
       <version>1.0.0</version>
       <packaging>pom</packaging>
       <name>springboot-cloud-demo</name>
       <description>springboot-cloud-demo</description>
       
   </project>
   ```

3. 声明有哪些子模块

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       
       <groupId>com.yshs</groupId>
       <artifactId>springboot-cloud-demo</artifactId>
       <version>1.0.0</version>
       <packaging>pom</packaging>
       <name>springboot-cloud-demo</name>
       <description>springboot-cloud-demo</description>
       
       <modules>
           <module>comment</module>
           <module>user</module>
       </modules>
       
   </project>
   ```

4. 定义子项目用到的所有依赖所需的具体版本号(包括 Java 版本和文件编码等)

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       
       <groupId>com.yshs</groupId>
       <artifactId>springboot-cloud-demo</artifactId>
       <version>1.0.0</version>
       <packaging>pom</packaging>
       <name>springboot-cloud-demo</name>
       <description>springboot-cloud-demo</description>
       
       <modules>
           <module>comment</module>
           <module>user</module>
       </modules>
       
       <properties>
           <java.version>17</java.version>
           <encoding>UTF-8</encoding>
           <hutool.version>5.8.27</hutool.version>
           <lombok.version>1.18.24</lombok.version>
           <springboot.version>3.3.0</springboot.version>
       </properties>
       
   </project>
   ```

5. 设置依赖管理

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       
       <groupId>com.yshs</groupId>
       <artifactId>springboot-cloud-demo</artifactId>
       <version>1.0.0</version>
       <packaging>pom</packaging>
       <name>springboot-cloud-demo</name>
       <description>springboot-cloud-demo</description>
       
       <modules>
           <module>comment</module>
           <module>user</module>
       </modules>
       
       <properties>
           <java.version>17</java.version>
           <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
           <hutool.version>5.8.27</hutool.version>
           <lombok.version>1.18.24</lombok.version>
           <springboot.version>3.3.0</springboot.version>
       </properties>
       
       <dependencyManagement>
           <dependencies>
               <!--hutool-->
               <dependency>
                   <groupId>cn.hutool</groupId>
                   <artifactId>hutool-all</artifactId>
                   <version>${hutool.version}</version>
               </dependency>
               <!--lombok-->
               <dependency>
                   <groupId>org.projectlombok</groupId>
                   <artifactId>lombok</artifactId>
                   <version>${lombok.version}</version>
               </dependency>
               <!--springboot-->
               <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter</artifactId>
                   <version>${springboot.version}</version>
               </dependency>
               <!--springboot-test-->
               <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-test</artifactId>
                   <version>${springboot.version}</version>
                   <scope>test</scope>
               </dependency>
               <!--springboot-web-->
               <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-web</artifactId>
                   <version>${springboot.version}</version>
               </dependency>
           </dependencies>
       </dependencyManagement>
       
   </project>
   ```

5. 设置构建相关配置

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
   
       <groupId>com.yshs</groupId>
       <artifactId>springboot-cloud-demo</artifactId>
       <version>0.0.1</version>
       <packaging>pom</packaging>
       <name>springboot-cloud-demo</name>
       <description>springboot-cloud-demo</description>
   
       <modules>
           <module>comment</module>
           <module>user</module>
       </modules>
   
       <properties>
           <java.version>17</java.version>
           <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
           <hutool.version>5.8.27</hutool.version>
           <lombok.version>1.18.24</lombok.version>
           <springboot.version>3.3.0</springboot.version>
       </properties>
   
       <dependencyManagement>
           <dependencies>
               <!--hutool-->
               <dependency>
                   <groupId>cn.hutool</groupId>
                   <artifactId>hutool-all</artifactId>
                   <version>${hutool.version}</version>
               </dependency>
               <!--lombok-->
               <dependency>
                   <groupId>org.projectlombok</groupId>
                   <artifactId>lombok</artifactId>
                   <version>${lombok.version}</version>
               </dependency>
               <!--springboot-->
               <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter</artifactId>
                   <version>${springboot.version}</version>
               </dependency>
               <!--springboot-test-->
               <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-test</artifactId>
                   <version>${springboot.version}</version>
                   <scope>test</scope>
               </dependency>
               <!--springboot-web-->
               <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-web</artifactId>
                   <version>${springboot.version}</version>
               </dependency>
           </dependencies>
       </dependencyManagement>
   
       <build>
           <plugins>
               <plugin>
                   <groupId>org.apache.maven.plugins</groupId>
                   <artifactId>maven-compiler-plugin</artifactId>
                   <version>3.13.0</version>
                   <configuration>
                       <!--保存变量原始名称，否则可能造成请求参数匹配不到-->
                       <parameters>true</parameters>
                       <source>${java.version}</source>
                       <target>${java.version}</target>
                       <encoding>${project.build.sourceEncoding}</encoding>
                   </configuration>
               </plugin>
           </plugins>
           <pluginManagement>
               <plugins>
                   <plugin>
                       <groupId>org.springframework.boot</groupId>
                       <artifactId>spring-boot-maven-plugin</artifactId>
                       <version>${springboot.version}</version>
                       <executions>
                           <!--打包时让每一个服务都可以独立运行-->
                           <execution>
                               <goals>
                                   <goal>repackage</goal>
                               </goals>
                           </execution>
                       </executions>
                       <configuration>
                           <!--排除lombok，因为他只在编译期有用-->
                           <excludes>
                               <exclude>
                                   <groupId>org.projectlombok</groupId>
                                   <artifactId>lombok</artifactId>
                               </exclude>
                           </excludes>
                       </configuration>
                   </plugin>
               </plugins>
           </pluginManagement>
       </build>
   
   </project>
   ```


## 通用模块

直接照抄就好了，因为通用模块是没有主类入口的，所以无需添加 build

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.yshs</groupId>
        <artifactId>springboot-cloud-demo</artifactId>
        <version>0.0.1</version>
    </parent>
    <version>0.0.1</version>
    <artifactId>comment</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>

</project>
```

## 微服务模块

### user-service

微服务有入口，就需要添加 build 属性了

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.yshs</groupId>
        <artifactId>springboot-cloud-demo</artifactId>
        <version>0.0.1</version>
    </parent>

    <artifactId>user-service</artifactId>
    <version>0.0.1</version>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.yshs</groupId>
            <artifactId>comment</artifactId>
            <version>0.0.1</version>
        </dependency>
    </dependencies>

    <build>
        <finalName>${project.artifactId}</finalName>
        <plugins>
            <plugin>
                <!--只要写这两个参数就可以了，其他的参数会继承父pom.xml中的配置-->
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

```

