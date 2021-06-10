package galimsarov.springframework.petclinic.model

import javax.persistence.*

@Entity
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