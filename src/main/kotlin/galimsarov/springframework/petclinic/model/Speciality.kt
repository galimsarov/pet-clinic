package galimsarov.springframework.petclinic.model

import lombok.Builder
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Builder
@Table(name = "specialties")
class Speciality : BaseEntity() {
    @Column(name = "description")
    var description = ""
}