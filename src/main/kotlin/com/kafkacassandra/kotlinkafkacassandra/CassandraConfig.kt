package com.kafkacassandra.kotlinkafkacassandra

import org.springframework.context.annotation.Configuration

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories




@Configuration
@EnableCassandraRepositories(basePackages = arrayOf("com.cassandra.cassandra"))
class CassandraConfig