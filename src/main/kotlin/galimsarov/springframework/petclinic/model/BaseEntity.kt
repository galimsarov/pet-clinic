package galimsarov.springframework.petclinic.model

import java.io.Serializable

open class BaseEntity: Serializable {
    var id: Long = 0
}