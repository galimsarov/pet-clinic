package galimsarov.springframework.petclinic.controllers

import galimsarov.springframework.petclinic.services.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController(private val ownerService: OwnerService) {
    @RequestMapping("", "/", "/index", "/index.html")
    fun listOwners(model: Model): String {
        model.addAttribute("owners", ownerService.findAll())
        return "owners/index"
    }

    @RequestMapping("/find")
    fun findOwners() = "notimplemented"
}