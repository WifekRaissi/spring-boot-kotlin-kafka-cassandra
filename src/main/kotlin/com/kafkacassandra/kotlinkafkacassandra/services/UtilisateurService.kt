package com.kafkacassandra.kotlinkafkacassandra.services

import org.springframework.cloud.stream.annotation.StreamListener


interface UtilisateurService{


    @StreamListener(value = "input")
    fun receiveUtilisateur(utilisateur: ByteArray)
}