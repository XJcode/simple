## 数据库表

#### 用户表
```mysql
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL COMMENT '名称',
  `login_name` varchar(64) NOT NULL COMMENT '登录账号',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `deleted` tinyint NOT NULL DEFAULT '0' COMMENT '是否删除1删除0没有',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';
```