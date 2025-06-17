# 使用官方 Maven 镜像作为基础镜像
FROM maven:3.5.0-jdk-8 AS build
 
# 将源代码复制到容器中
COPY src /home/app/src
COPY /publicze_platform/pom.xml /home/app
 
# 构建项目
WORKDIR /home/app
RUN mvn -f /home/app/pom.xml clean package
 
# 使用更小的 Java 镜像
FROM openjdk:8-jre-slim
 
# 从构建阶段复制 JAR 文件
COPY --from=build /home/app/target/publicze_platform-0.0.1-SNAPSHOT.jar /usr/local/lib/publicze-platform.jar
 
# 暴露端口（假设你的应用运行在8080端口）
EXPOSE 8093
 
# 运行应用
ENTRYPOINT ["java", "-jar", "/usr/local/lib/publicze-platform.jar"]
