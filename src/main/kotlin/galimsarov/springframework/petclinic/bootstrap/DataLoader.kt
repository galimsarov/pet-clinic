package galimsarov.springframework.petclinic.bootstrap

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.model.Pet
import galimsarov.springframework.petclinic.model.PetType
import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.services.OwnerService
import galimsarov.springframework.petclinic.services.PetTypeService
import galimsarov.springframework.petclinic.services.VetService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class DataLoader(
    private val ownerService: OwnerService,
    private val vetService: VetService,
    private val petTypeService: PetTypeService
    ): CommandLineRunner {
    override fun run(vararg args: String?) {
        val dog = PetType()
        dog.name = "Dog"
        val savedDogPetType = petTypeService.save(dog)

        val cat = PetType()
        cat.name = "Cat"
        val savedCatPetType = petTypeService.save(cat)

        val owner1 = Owner()
        owner1.firstName = "Михаил"
        owner1.lastName = "Западный"
        owner1.address = "Кирпичная, 123"
        owner1.city = "Миасс"
        owner1.telephone = "123-12-31"

        val mikesDog = Pet()
        mikesDog.petType = savedDogPetType
        mikesDog.owner = owner1
        mikesDog.birthDate = LocalDate.now()
        mikesDog.name = "Рустэм"
        owner1.pets.add(mikesDog)

        ownerService.save(owner1)

        val owner2 = Owner()
        owner2.firstName = "Флюра"
        owner2.lastName = "Зелёная"
        owner2.address = "Кирпичная, 123"
        owner2.city = "Миасс"
        owner2.telephone = "123-12-31"

        val fionasCat = Pet()
        fionasCat.name = "Кошка"
        fionasCat.owner = owner2
        fionasCat.birthDate = LocalDate.now()
        fionasCat.petType = savedCatPetType
        owner2.pets.add(fionasCat)

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