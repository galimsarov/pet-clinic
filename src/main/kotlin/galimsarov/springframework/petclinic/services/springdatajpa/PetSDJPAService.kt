package galimsarov.springframework.petclinic.services.springdatajpa

import galimsarov.springframework.petclinic.model.Pet
import galimsarov.springframework.petclinic.repositories.PetRepository
import galimsarov.springframework.petclinic.services.PetService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdatajpa")
class PetSDJPAService(private val petRepository: PetRepository) : PetService {
    override fun findAll() = petRepository.findAll().toSet()

    override fun findById(id: Long): Pet {
        val optionalPet = petRepository.findById(id)
        return if (optionalPet.isPresent)
            optionalPet.get()
        else
            Pet()
    }

    override fun save(objectToSave: Pet) = petRepository.save(objectToSave)

    override fun delete(objectToDelete: Pet) = petRepository.delete(objectToDelete)

    override fun deleteById(id: Long) = petRepository.deleteById(id)
}