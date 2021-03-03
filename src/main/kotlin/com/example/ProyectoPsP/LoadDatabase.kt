package com.example.ProyectoPsP

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoadDatabase {
    companion object{
        val logger = LoggerFactory.getLogger(LoadDatabase.javaClass)
    }

    @Bean
    fun initDatabase(PersonasRepository:PersonasRepository): CommandLineRunner{
        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading" + PersonasRepository.save(Personas("Leevi","Tuomala","male","leevi.toumala@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Jimmie","Jennings","male","jimmie.jennings@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Filippa","Olsen","female","filippa.olsen@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Maxime","Riviere","male","maxime.riviere@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Ella","Wilson","femlae","ella.wilson@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Gabrielle","Campbell ","female","Gabrielle.Campbell@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Leana","Francois","female","leana.Francois@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Doris","Stewart","female","doris.stewart@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Angeles","Jimenez","female","angeles.jimenez@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Topias","Hokkanen","male","topias.hokkanen@example.com")))
            logger.info("Preloading" + PersonasRepository.save(Personas("Byron","Farragher","male","byron.farragher@example.com")))
        }
    }
}