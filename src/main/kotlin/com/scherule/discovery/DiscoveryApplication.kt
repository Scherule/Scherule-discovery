package com.scherule.discovery

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
class DiscoveryApplication

fun main(args: Array<String>) {
    SpringApplication.run(DiscoveryApplication::class.java, *args)
}
