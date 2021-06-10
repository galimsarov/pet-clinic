package galimsarov.springframework.petclinic.repositories

import galimsarov.springframework.petclinic.model.Owner
import org.springframework.data.repository.CrudRepository

interface OwnerRepository : CrudRepository<Owner, Long>