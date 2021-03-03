package com.example.ProyectoPsP

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonasController(private val personasRepository: PersonasRepository) {
    val llave="Estaeslallave"

//puerto 8085


    @GetMapping("/personas")
    fun getallPersonas() : List<Personas>{
        return personasRepository.findAll()
    }
    @GetMapping("/personas/{id}")
    fun getPersona(@PathVariable id : Long) : Personas {
        return personasRepository.findById(id).get()
    }
    @GetMapping("/personas/prueba/{id}")
    fun getPersonaCrypto(@PathVariable id : String): String{
        return cryptoController.encriptacion(id,llave)
    }

    @GetMapping("/personas/prueba1/{id}")
    fun getPersonaDesCrypto(@PathVariable id : String):String{
        return cryptoController.desencriptacion(id,llave)
    }

}