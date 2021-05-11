package galimsarov.springframework.petclinic.bootstrap

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.services.OwnerService
import galimsarov.springframework.petclinic.services.VetService
import galimsarov.springframework.petclinic.services.map.OwnerServiceMap
import galimsarov.springframework.petclinic.services.map.VetServiceMap
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader: CommandLineRunner {
    private val ownerService: OwnerService
    private val vetService: VetService

    init {
        ownerService = OwnerServiceMap()
        vetService = VetServiceMap()
    }

    override fun run(vararg args: String?) {
        val owner1 = Owner()
        owner1.id = 1L
        owner1.firstName = "Михаил"
        owner1.lastName = "Западный"
        ownerService.save(owner1)

        val owner2 = Owner()
        owner1.id = 2L
        owner1.firstName = "Флюра"
        owner1.lastName = "Зелёная"
        ownerService.save(owner2)

        println("Владельцы живтоных...")

        val vet1 = Vet()
        vet1.id = 1L
        vet1.firstName = "Самуил"
        vet1.lastName = "Топоров"
        vetService.save(vet1)

        val vet2 = Vet()
        vet1.id = 2L
        vet1.firstName = "Яков"
        vet1.lastName = "Грузов"
        vetService.save(vet2)

        println("Ветеринары загружены...")
    }
}