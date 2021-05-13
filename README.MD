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