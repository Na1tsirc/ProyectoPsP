package com.example.ProyectoPsP

import org.springframework.data.jpa.repository.JpaRepository
//repositorio interfaz donde Añadimos la Clase Personas
interface PersonasRepository : JpaRepository<Personas, Long>