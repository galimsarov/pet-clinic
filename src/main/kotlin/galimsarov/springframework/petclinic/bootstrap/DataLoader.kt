package galimsarov.springframework.petclinic.bootstrap

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.services.OwnerService
import galimsarov.springframework.petclinic.services.VetService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(private val ownerService: OwnerService, private val vetService: VetService): CommandLineRunner {
    override fun run(vararg args: String?) {
        val owner1 = Owner()
        owner1.firstName = "Михаил"
        owner1.lastName = "Западный"
        ownerService.save(owner1)

        val owner2 = Owner()
        owner2.firstName = "Флюра"
        owner2.lastName = "Зелёная"
        ownerService.save(owner2)

        println("Владельцы живтоных загружены...")

        val vet1 = Vet()
        vet1.firstName = "Самуил"
        vet1.lastName = "Топоров"
        vetService.save(vet1)

        val vet2 = Vet()
        vet2.firstName = "Яков"
        vet2.lastName = "Грузов"
        vetService.save(vet2)

        println("Ветеринары загружены...")
    }
}