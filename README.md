java 开源b2b2c多用户电商平台
===
环境需知
===
* 请确保 `mysql` 数据库编码为 `utf-8`  java jdk 版本为 `1.6` 或 `1.7` 推荐 `1.7` 版本
  * mysql数据库编码查看
    * bash `SHOW VARIABLES LIKE 'character%'`
  * 出现乱码请检查数据库字符编码
  * 导入数据库脚本 `shopping-demo.sql` 文件即可，此版本不再需要安装。
  * 如果有`server`或`database`编码不是utf8，使用以下命令更改
    * SET character_set_server = utf8
    * SET character_set_database = utf8
  * 如有数据库无法直接使用命令更改成功，请更改my.ini配置文件的编码
  * [mysqld]
    * `character-set-server=utf8`
  * [client]
    * `default-character-set=utf8`
  * [mysql]
    * `default-character-set=utf8`

项目工程使用
===
* 导入工程IDEA集成工具中，然后更改项目中的数据库配置文件
* 打包部署项目到`tomcat`等应用服务器中
* 创建一个空的`mysql`数据库(确保`mysql`数据库编码为`utf-8`)

部署到服务器
===
* 在本地使用IDEA集成开发工具将项目打包成war包，上传到服务器`tomcat`的`webapps`目录下
* 或者直接在本地`tomcat`的`webapps`下面部署的项目压缩，上传到服务器`tomcat`的`webapps`目录下并解压缩。
