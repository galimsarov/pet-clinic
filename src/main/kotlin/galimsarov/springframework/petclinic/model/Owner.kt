package galimsarov.springframework.petclinic.model

class Owner: Person() {
    var address = ""
    var city = ""
    var telephone = ""
    val pets = mutableSetOf<Pet>()
}