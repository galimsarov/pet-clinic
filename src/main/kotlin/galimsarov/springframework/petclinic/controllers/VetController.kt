package galimsarov.springframework.petclinic.controllers

import galimsarov.springframework.petclinic.services.VetService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController(private val vetService: VetService) {
    @RequestMapping("/vets", "/vets/index", "/vets/index.html")
    fun listVets(model: Model): String {
        model.addAttribute("vets", vetService.findAll())
        return "vets/index"
    }
}