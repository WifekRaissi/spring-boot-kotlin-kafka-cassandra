package com.kafkacassandra.kotlinkafkacassandra.entities
import com.datastax.driver.core.utils.UUIDs
import org.springframework.data.cassandra.mapping.PrimaryKey
import org.springframework.data.cassandra.mapping.Table
import java.util.*

@Table("utilisateur")
data class Utilisateur (
        @PrimaryKey
        val id: Int=1,/*UUID = UUIDs.timeBased(),*/
        var firstName:String="",
        var lastName:String=""
)