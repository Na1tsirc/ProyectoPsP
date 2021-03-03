package com.example.ProyectoPsP

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

//Declaramos la clase que tendra nuestra base de datos
@Entity
class Personas(var name : String ,
               var surname: String,
               var gender : String,
               var email: String) {
    //id y generatedvalue
    @Id
    @GeneratedValue

    private val idGen: Long?=null

    override fun equals(other:Any?): Boolean{
        if (other is Personas){
            return other.idGen == idGen && idGen != null
        } else{
            return false
        }
    }

    override fun hashCode(): Int {
        return Objects.hash(idGen,name,surname,gender,email)
    }

    override fun toString(): String {
        return "$idGen es: $name es el nombre de la persona y $email es su correo"
    }


}