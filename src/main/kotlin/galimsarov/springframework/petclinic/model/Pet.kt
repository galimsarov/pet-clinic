package galimsarov.springframework.petclinic.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "pets")
class Pet: BaseEntity() {
    @Column(name = "name")
    var name = ""

    @ManyToOne
    @JoinColumn(name = "type_id")
    var petType = PetType()

    @ManyToOne
    @JoinColumn(name = "owner_id")
    var owner = Owner()

    @Column(name = "birth_date")
    var birthDate: LocalDate = LocalDate.parse("2021-01-01")

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "pet")
    var visits = mutableSetOf<Visit>()
}