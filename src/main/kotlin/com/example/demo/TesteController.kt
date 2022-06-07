package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.apache.logging.log4j.LogManager;


@RestController
@RequestMapping("/teste")
class TesteController {

    companion object{
        private val LOGGER = LogManager.getLogger(TesteController);
    }

    @GetMapping
    fun getString(): String{

        LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");

        return "Retornando uma String"
    }
}