package com.kafkacassandra.kotlinkafkacassandra.repositories


import com.kafkacassandra.kotlinkafkacassandra.entities.Utilisateur
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository


@Repository
interface UtilisateurRepository:   CassandraRepository<Utilisateur> {
    fun findByfirstName(firstName: String): MutableList<Utilisateur>

}