## 电商项目搭建

### 模块划分
>功能模块化；业务服务化
- 订单系统
- 商品系统
- 支付系统
- 积分系统
- 用户系统
- 活动系统
- 日志异常处理 全局模块

##进度

- euraka注册中心模块
- user用户中心模块
- Ribbon服务消费者
服务通信基于http restful

2021.5.12重新搭建 基于springcloud alibaba框架的电商项目

主要组件：nacos 注册中心与配置中心，seata 分布式事务解决方案，Sentinel 服务容错解决方案（初步不需要要添加），Dubbo（RPC调用）

生产者模块:（提供基本服务的模块）
    user,product,order,sms,wms...
消费者模块:
    给前端，小程序等调用的api
## 用户模块
    需求分析：
        1.多种登录方式：手机，微信，qq,微博
        2.可进行绑定和解绑或更换绑定:用户使用任意方式登录后可绑定和解绑或者绑定其他登录授权
        3.支持unionid（针对QQ/微信等）：如果开发者拥有多个移动应用，网站应用和公众号，可通过过去用户基本信息中的unionid来区分用户的唯一性，因为只要是同一个微信开放平台账号下
        的移动应用，网站应用和公众账号，用户的unionid是惟一的。

### 用户表😊
    1.users

|    字段    |   类型    |  键  | 为空 | 默认 |     备注     |
| :--------: | :-------: | :--: | :--: | :--: | :----------: |
|     id     |    int    | PRI  |  no  |      | 用户唯一索引 |
|    name    |  varchar  |      |  no  |      |   用户昵称   |
| avatar_url |  varchar  |      | yes  |      |   头像地址   |
|   phone    |  varchar  | UNI  | yes  |      |    手机号    |
|  password  |  varchar  |      | yes  |      |    手机号    |
| created_at | timestamp |      |  no  |      |   创建时间   |
| updated_at | timestamp |      | yes  |      |   更新时间   |

Java代码中需要再次开发的使用TODO注解
