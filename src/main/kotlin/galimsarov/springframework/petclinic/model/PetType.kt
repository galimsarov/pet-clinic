package galimsarov.springframework.petclinic.model

import lombok.Builder
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Builder
@Table(name = "types")
class PetType : BaseEntity() {
    @Column(name = "name")
    var name = ""
}