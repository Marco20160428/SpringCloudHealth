# SpringCloudHealth  基于SpringCloud Netflix搭建
【1】 eureka-server搭建双节点注册中心集群

【2】 user-service搭建双节点客户端集群

【3】 intervention-service为调用user服务的客户端，通过RestTemplate

【4】 zuul-server为网关

【5】 config-local搭建了本地为配置中心的服务器，相应的客户端user-service读取（仅做读取测试）

【6】 config-git搭建了以git为配置中心的服务器，配置在SpringCloudHealthConfig仓库，客户端user-service读取（仅做读取测试）
