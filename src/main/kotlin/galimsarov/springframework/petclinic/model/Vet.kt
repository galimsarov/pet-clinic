package galimsarov.springframework.petclinic.model

class Vet: Person() {
    val specialities = mutableSetOf<Speciality>()
}
