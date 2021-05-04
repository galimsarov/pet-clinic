package galimsarov.springframework.petclinic.services

import galimsarov.springframework.petclinic.model.Pet

interface PetService {
    fun findById(id: Long): Pet
    fun save(pet: Pet): Pet
    fun findAll(): Set<Pet>
}