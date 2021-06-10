package galimsarov.springframework.petclinic.repositories

import galimsarov.springframework.petclinic.model.Pet
import org.springframework.data.repository.CrudRepository

interface PetRepository : CrudRepository<Pet, Long>