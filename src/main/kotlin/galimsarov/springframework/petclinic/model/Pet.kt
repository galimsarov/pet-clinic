package galimsarov.springframework.petclinic.model

import java.time.LocalDate

class Pet: BaseEntity() {
    var petType = PetType()
    var owner = Owner()
    var birthDate = LocalDate.parse("2021-01-01")
    var name = ""
}