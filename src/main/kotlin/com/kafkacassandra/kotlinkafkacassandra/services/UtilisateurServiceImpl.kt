package com.kafkacassandra.kotlinkafkacassandra.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.kafkacassandra.kotlinkafkacassandra.entities.Utilisateur
import com.kafkacassandra.kotlinkafkacassandra.repositories.UtilisateurRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Service

@Service
open class UtilisateurServiceImpl: UtilisateurService {
    @Autowired
    lateinit var utilisateurRepository: UtilisateurRepository
    val JSON = jacksonObjectMapper()


    private val logger = LoggerFactory.getLogger(UtilisateurService::class.java)


    @StreamListener("input")
    override fun receiveUtilisateur(utilisateur:ByteArray){

        val parsedMessage = JSON.readValue(utilisateur, String::class.java)
        val utilisateur=JSON.readValue(parsedMessage, Utilisateur::class.java)
        logger.info("Utilisateur received: " + utilisateur)


        utilisateurRepository.save(utilisateur)
       logger.info("Utilisateur  added: " + utilisateur)
    }



}