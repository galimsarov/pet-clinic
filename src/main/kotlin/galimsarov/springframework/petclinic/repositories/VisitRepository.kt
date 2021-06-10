package galimsarov.springframework.petclinic.repositories

import galimsarov.springframework.petclinic.model.Visit
import org.springframework.data.repository.CrudRepository

interface VisitRepository : CrudRepository<Visit, Long>