package galimsarov.springframework.petclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {
    @RequestMapping("", "/", "index", "index.html")
    fun index() = "index"

    @RequestMapping("/oups")
    fun oupsHandler() = "notimplemented"
}