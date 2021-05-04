package galimsarov.springframework.petclinic.services

import galimsarov.springframework.petclinic.model.Owner

interface OwnerService {
    fun findByLastName(lastName: String): Owner
    fun findById(id: Long): Owner
    fun save(owner: Owner): Owner
    fun findAll(): Set<Owner>
}