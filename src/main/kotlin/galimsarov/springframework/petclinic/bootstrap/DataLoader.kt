package galimsarov.springframework.petclinic.bootstrap

import galimsarov.springframework.petclinic.model.*
import galimsarov.springframework.petclinic.services.*
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class DataLoader(
    private val ownerService: OwnerService,
    private val vetService: VetService,
    private val petTypeService: PetTypeService,
    private val specialityService: SpecialityService,
    private val visitService: VisitService
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val count = petTypeService.findAll().size
        if (count == 0)
            loadData()
    }

    private fun loadData() {
        val dog = PetType()
        dog.name = "Dog"
        val savedDogPetType = petTypeService.save(dog)

        val cat = PetType()
        cat.name = "Cat"
        val savedCatPetType = petTypeService.save(cat)

        val radiology = Speciality()
        radiology.description = "Radiology"
        val savedRadiology = specialityService.save(radiology)

        val surgery = Speciality()
        surgery.description = "Surgery"
        val savedSurgery = specialityService.save(surgery)

        val dentistry = Speciality()
        dentistry.description = "Dentistry"
        val savedDentistry = specialityService.save(dentistry)

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

        val catVisit = Visit()
        catVisit.pet = fionasCat
        catVisit.date = LocalDate.now()
        catVisit.description = "Котёнок чихает"

        visitService.save(catVisit)

        println("Владельцы живтоных загружены...")

        val vet1 = Vet()
        vet1.firstName = "Самуил"
        vet1.lastName = "Топоров"
        vet1.specialities.add(savedRadiology)
        vetService.save(vet1)

        val vet2 = Vet()
        vet2.firstName = "Яков"
        vet2.lastName = "Грузов"
        vet2.specialities.add(savedSurgery)
        vetService.save(vet2)

        println("Ветеринары загружены...")
    }
}