package galimsarov.springframework.petclinic.services

import galimsarov.springframework.petclinic.model.Vet

interface VetService {
    fun findById(id: Long): Vet
    fun save(vet: Vet): Vet
    fun findAll(): Set<Vet>
}