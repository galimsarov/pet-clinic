package galimsarov.springframework.petclinic.model

import lombok.Builder
import javax.persistence.*

@Entity
@Builder
@Table(name = "owners")
class Owner : Person() {
    @Column(name = "address")
    var address = ""

    @Column(name = "city")
    var city = ""

    @Column(name = "telephone")
    var telephone = ""

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "owner")
    var pets = mutableSetOf<Pet>()
}