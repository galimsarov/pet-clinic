package galimsarov.springframework.petclinic.model

import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class Person : BaseEntity() {
    @Column(name = "first_name")
    var firstName = ""

    @Column(name = "last_name")
    var lastName = ""
}