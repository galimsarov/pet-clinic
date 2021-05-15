package galimsarov.springframework.petclinic.model

class Owner: Person() {
    val pets = mutableSetOf<Pet>()
}