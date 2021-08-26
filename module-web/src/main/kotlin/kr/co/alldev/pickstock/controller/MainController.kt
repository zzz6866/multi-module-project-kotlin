package kr.co.alldev.pickstock.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@Controller
@RequestMapping("/")
class MainController {
    @GetMapping("/")
    fun main(): String {
        return "index"
    }
}