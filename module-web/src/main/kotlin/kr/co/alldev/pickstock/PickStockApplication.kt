package kr.co.alldev.pickstock

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PickStockApplication {

    companion object {
        private val log = LoggerFactory.getLogger(PickStockApplication::class.java)

        @JvmStatic
        fun main(args: Array<String>) {
            log.info("SPRING BOOT RUN")
            runApplication<PickStockApplication>(*args)
        }
    }
}