package galimsarov.springframework.petclinic.model

import javax.persistence.*

@Entity
@Table(name = "vets")
class Vet : Person() {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "vet_specialties",
        joinColumns = [JoinColumn(name = "vet_id")],
        inverseJoinColumns = [JoinColumn(name = "speciality_id")]
    )
    var specialities = mutableSetOf<Speciality>()
}
