package galimsarov.springframework.petclinic.repositories

import galimsarov.springframework.petclinic.model.Speciality
import org.springframework.data.repository.CrudRepository

interface SpecialityRepository : CrudRepository<Speciality, Long>