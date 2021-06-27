package galimsarov.springframework.petclinic.model

import lombok.Builder
import java.time.LocalDate
import javax.persistence.*

@Entity
@Builder
@Table(name = "visits")
class Visit: BaseEntity() {
    @Column(name = "date")
    var date = LocalDate.parse("2021-01-01")

    @Column(name = "description")
    var description = ""

    @ManyToOne
    @JoinColumn(name = "pet_id")
    var pet = Pet()
}