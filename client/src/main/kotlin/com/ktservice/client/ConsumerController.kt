package com.ktservice.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class ConsumerController {
    @Autowired
    lateinit var restTemplate: RestTemplate

    @GetMapping("/consumer")
    fun consumer(): String? {
        return restTemplate.getForObject("http://KOTLIN-SERVICE/hello", String::class.java)
    }
}