package galimsarov.springframework.petclinic.services

import galimsarov.springframework.petclinic.model.Owner

interface OwnerService: CrudService<Owner, Long> {
    fun findByLastName(lastName: String): Owner
}