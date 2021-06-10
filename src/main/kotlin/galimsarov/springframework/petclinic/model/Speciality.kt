package galimsarov.springframework.petclinic.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "specialties")
class Speciality : BaseEntity() {
    @Column(name = "description")
    var description = ""
}