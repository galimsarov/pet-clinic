package galimsarov.springframework.petclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController {
    @RequestMapping("", "/", "/index", "/index.html")
    fun listOwners() = "owners/index"
}