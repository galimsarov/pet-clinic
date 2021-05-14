package galimsarov.springframework.petclinic.model

class Owner: Person() {
    var pets = mutableSetOf<Pet>()
}