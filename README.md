# online-taxi-test

服务拆分

业务层



模块
项目名
描述




乘客端
api-passenger(订单bean。@RequestBody 订单的bean)
乘客端


司机端
api-driver
司机端


司机听单
api-listen-order
司机听单



6

能力层



模块
项目名




app升级
service-app-update


订单
service-order(订单bean。@RequestBody 订单的bean)


派单
service-order-dispatch


乘客用户管理
service-passenger-user


短信
service-sms


计价
service-valuation


验证码
service-verification-code


钱包
service-wallet


支付
service-payment


地图
service-map



18

spring cloud 基础



模块
项目名




注册中心
cloud-eureka


配置中心
cloud-config-server


网关
cloud-zuul


熔断监控(ui)
cloud-hystrix-dashboard


健康检查
cloud-admin


链路追踪
cloud-zipkin-ui





基础common
所有服务都引用的一个 二方库。



模块
项目名




通用，工具类,异常，校验
internal-common








用到的技术
boot,cloud,maven,git ,mysql,reids, mq,
