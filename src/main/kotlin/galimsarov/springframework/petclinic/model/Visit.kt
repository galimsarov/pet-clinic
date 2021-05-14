package galimsarov.springframework.petclinic.model

import java.time.LocalDate

class Visit: BaseEntity() {
    var date = LocalDate.parse("2021-01-01")
    var description = ""
    var pet = Pet()
}