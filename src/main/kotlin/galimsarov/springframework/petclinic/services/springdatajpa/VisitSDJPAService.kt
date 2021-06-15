package galimsarov.springframework.petclinic.services.springdatajpa

import galimsarov.springframework.petclinic.model.Visit
import galimsarov.springframework.petclinic.repositories.VisitRepository
import galimsarov.springframework.petclinic.services.VisitService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdatajpa")
class VisitSDJPAService(private val visitRepository: VisitRepository) : VisitService {
    override fun findAll() = visitRepository.findAll().toSet()

    override fun findById(id: Long): Visit {
        val optionalVisit = visitRepository.findById(id)
        return if (optionalVisit.isPresent)
            optionalVisit.get()
        else
            Visit()
    }

    override fun save(objectToSave: Visit) = visitRepository.save(objectToSave)

    override fun delete(objectToDelete: Visit) = visitRepository.delete(objectToDelete)

    override fun deleteById(id: Long) = visitRepository.deleteById(id)
}