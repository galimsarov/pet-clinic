package galimsarov.springframework.petclinic.repositories

import galimsarov.springframework.petclinic.model.PetType
import org.springframework.data.repository.CrudRepository

interface PetTypeRepository : CrudRepository<PetType, Long>