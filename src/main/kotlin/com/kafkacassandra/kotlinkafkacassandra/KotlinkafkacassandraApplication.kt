package com.kafkacassandra.kotlinkafkacassandra

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
@EnableBinding(Sink::class)
class KotlinkafkacassandraApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinkafkacassandraApplication::class.java, *args)
}
