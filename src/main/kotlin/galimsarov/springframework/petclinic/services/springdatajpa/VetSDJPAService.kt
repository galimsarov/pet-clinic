package galimsarov.springframework.petclinic.services.springdatajpa

import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.repositories.VetRepository
import galimsarov.springframework.petclinic.services.VetService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdatajpa")
class VetSDJPAService(private val vetRepository: VetRepository) : VetService {
    override fun findAll() = vetRepository.findAll().toSet()

    override fun findById(id: Long): Vet {
        val optionalVet = vetRepository.findById(id)
        return if (optionalVet.isPresent)
            optionalVet.get()
        else
            Vet()
    }

    override fun save(objectToSave: Vet) = vetRepository.save(objectToSave)

    override fun delete(objectToDelete: Vet) = vetRepository.delete(objectToDelete)

    override fun deleteById(id: Long) = vetRepository.deleteById(id)
}