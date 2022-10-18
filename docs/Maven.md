# Maven

标准化项目结构
标准化构建流程（编译-测试-打包-发布）
依赖管理机制
项目管理工具

Maven 配置文件：pom.xml
    项目对象模型 POM
    依赖管理模型 Dependency

仓库
    存储资源主要为各种jar包
    中央仓库
    远程仓库（私有）
    本地仓库

生命周期
    清理 clean
    核心 default
    发布 site
    pre-clean -> clean -> post-clean -> compile -> test -> package -> install -> pre-site -> site -> post-site

Maven 坐标 | 项目的唯一标识
    groupId 定义项目隶属组织（通常是域名反写）
    artifactId 定义项目名称（通常即为模块名称）
    version 定义项目版本号

Maven 项目依赖
    依赖管理 `<dependencies></dependencies>`
    依赖传递
        直接依赖&间接依赖
        路径优先(层级浅的优先级高)&声明优先(先配置的优先级高)
    可选依赖 `<optional>true</optional>`
    排除依赖 `<exclusions><exclusion><groupId>log4j</groupId><artifactId>log4j</artifactId></exclusion></exclusions>`
    依赖范围 `<scope></scope>`
        compile 主代码 测试代码 打包
        test 测试代码
        provided 主代码 测试代码
        runtime 打包
