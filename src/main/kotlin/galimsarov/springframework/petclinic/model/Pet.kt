package galimsarov.springframework.petclinic.model

import java.time.LocalDate

class Pet: BaseEntity() {
    private lateinit var petType: PetType
    private lateinit var owner: Owner
    private lateinit var birthDate: LocalDate
}