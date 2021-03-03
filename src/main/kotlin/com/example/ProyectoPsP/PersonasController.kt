package com.example.ProyectoPsP

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonasController(private val personasRepository: PersonasRepository) {
//puerto 8085
    @GetMapping("/personas")
    fun getallPersonas() : List<Personas>{
        return personasRepository.findAll()
    }
    @GetMapping("/personas/{id}")
    fun getPersona(@PathVariable id : Long) : Personas {
        return personasRepository.findById(id).get()
    }

}