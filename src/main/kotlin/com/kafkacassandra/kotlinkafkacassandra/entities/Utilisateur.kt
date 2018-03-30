package com.kafkacassandra.kotlinkafkacassandra.entities

import org.springframework.data.cassandra.mapping.PrimaryKey
import org.springframework.data.cassandra.mapping.Table

@Table("utilisateur")
data class Utilisateur (
        @PrimaryKey
        val id: Int=1,
        var firstName:String="",
        var lastName:String=""
)