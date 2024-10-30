## java-swing-gui-stater

本项目是一个 `Java Swing GUI` 项目基础模板，你的一切想法都可以基于这个项目开发

大部分 `Java GUI` 是基于 `JavaFX` 开发的，但我不喜欢，我推荐 `Swing` 原因如下：

- 无需依赖：`JRE` 自带，无需引入多余的依赖即可直接开发，不用考虑用户 `JRE` 版本做特殊适配
- 学习成本低：使用 `IDEA` 自带的 `GUI Designer` 即可，只使用 `Java` 语言，不用学习 `FXML`
- 美观程度：原生 `Java Swing` 界面看起来是老古董，但是使用 `flatlaf` 会大幅美化

## Desc

本项目做的事情：

- 提供了基础的依赖和配置（配套注释）
- 提供了构建和打包配置（一键生成 `Jar` 文件）
- 在 `README` 中提供了 **详细** 的配置开发教程
- 在代码中提供了 **详细** 的注释
- 提供了一些 `Java Swing GUI` 代码写法

## Quick Start

(1) 推荐准备 `JDK 8` 环境，无论 `OpenJDK` 或 `Oracle JDK` 都可，不要求版本

(2) 准备一个 `IntelliJ IDEA` 社区版专业版都可，推荐使用较新的版本

(3) 使用 `IDEA` 打开本项目，参考下图配置 `GUI Designer`

![](image/001.png)

(4) 本项目已经有默认的 `Form` 你可以按照下图这样自行添加

![](image/002.png)

(5) 打包成一个 `Fat Jar` 然后使用 `java -jar xxx.jar` 即可启动

使用 `mvn clean package` 或者 `IDEA` 自带按钮即可打包

![](image/003.png)

打包后的 `Jar` 文件位于

![](image/004.png)

这是一个类似 `SpringBoot` 装满了依赖的 `Fat Jar` 使用简短的命令即可启动

```shell
java -jar java-swing-gui-starter-0.0.1-jar-with-dependencies.jar
```

你可以使用 `Java 8` 到 `Java 24` 任意版本都可以正常启动（强大的兼容）

文件名是自动生成的，自己开发时按需修改 `pom.xml` 文件内容即可（我已经给出注释）

![](image/006.png)

## About

以下是一些基于 `Java Swing` 开发的程序

Jar Analyzer 项目 (开源)

https://github.com/jar-analyzer/jar-analyzer

![](image/case01.png)

Shell Analyzer 项目 (开源)

https://github.com/4ra1n/shell-analyzer

![](image/case04.png)

Mysql Fake Server 项目 (开源)

https://github.com/4ra1n/mysql-fake-server

![](image/case03.png)

Jar Obfuscator 项目 (开源)

https://github.com/jar-analyzer/jar-obfuscator

![](image/case02.png)

Jar Analyzer 子项目 Java DBG (开源)

https://github.com/jar-analyzer/jar-analyzer/tree/master/src/main/java/me/n1ar4/dbg

![](image/case05.png)

Code Inspector 项目 (开源)

https://github.com/4ra1n/code-inspector

![](image/case07.png)

Super Xray 项目 (开源)

https://github.com/4ra1n/super-xray

![](image/case06.png)
