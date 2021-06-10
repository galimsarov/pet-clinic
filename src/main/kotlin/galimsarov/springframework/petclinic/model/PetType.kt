package galimsarov.springframework.petclinic.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "types")
class PetType : BaseEntity() {
    @Column(name = "name")
    var name = ""
}