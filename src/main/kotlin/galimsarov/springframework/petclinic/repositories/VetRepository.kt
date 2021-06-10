package galimsarov.springframework.petclinic.repositories

import galimsarov.springframework.petclinic.model.Vet
import org.springframework.data.repository.CrudRepository

interface VetRepository : CrudRepository<Vet, Long>